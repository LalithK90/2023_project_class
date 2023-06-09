package lk.frist_day_project.frist_day.relationship_sql.onetoone.user.controller;

import lk.frist_day_project.frist_day.relationship_sql.onetoone.task.service.TaskService;
import lk.frist_day_project.frist_day.relationship_sql.onetoone.user.entity.User;
import lk.frist_day_project.frist_day.relationship_sql.onetoone.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user_one_one")
@AllArgsConstructor
public class UserController {

    private final UserService userService;
    private final TaskService taskService;

    // to get all data from db to visualize in FE
    @GetMapping
    public String findAll(Model mode) {
        mode.addAttribute("users", userService.findAll());
        return "relationship_sql/onetoone/user/user_one_one";
    }

    //get a form to add new user to db
    @GetMapping("/add")
    public String form(Model model) {
        model.addAttribute("addStatus", false);
        model.addAttribute("user", new User());
        model.addAttribute("tasks" , taskService.findAll());
        return "relationship_sql/onetoone/user/user_one_one_add";
    }

    //to persist user details
    @PostMapping
    public String persist(@ModelAttribute User user) {
        userService.persist(user);
        return "redirect:/user_one_one";
    }

    //to edit a particular user using user_id
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        model.addAttribute("addStatus", true);
        model.addAttribute("user", userService.findById(id));
        model.addAttribute("tasks" , taskService.findAll());
        return "relationship_sql/onetoone/user/user_one_one_add";
    }

    //to view details a particular user using user_id
    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") Long id,Model model) {
        model.addAttribute("user", userService.findById(id));
        return "relationship_sql/onetoone/user/user_one_one_view";
    }

    //to delete a particular user using user_id
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return "redirect:/user_one_one";
    }

}
