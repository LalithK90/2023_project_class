package lk.frist_day_project.frist_day.relationship_sql.onetomany.user.controller;

import lk.frist_day_project.frist_day.relationship_sql.onetomany.user.service.UserNMService;
import lk.frist_day_project.frist_day.relationship_sql.onetomany.user.entity.UserNM;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user_one_many")
@AllArgsConstructor
public class UserNMController {

    private final UserNMService userService;

    // to get all data from db to visualize in FE
    @GetMapping
    public String findAll(Model mode) {
        mode.addAttribute("users", userService.findAll());
        return "relationship_sql/onetomany/user/user_one_one";
    }

    //get a form to add new user to db
    @GetMapping("/add")
    public String form(Model model) {
        model.addAttribute("addStatus", false);
        model.addAttribute("user", new UserNM());
        return "relationship_sql/onetomany/user/user_one_one_add";
    }

    //to persist user details
    @PostMapping
    public String persist(@ModelAttribute UserNM user) {
        userService.persist(user);
        return "redirect:/user_one_one";
    }

    //to edit a particular user using user_id
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        model.addAttribute("addStatus", true);
        model.addAttribute("user", userService.findById(id));
        return "relationship_sql/onetomany/user/user_one_one_add";
    }

    //to view details a particular user using user_id
    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") Long id,Model model) {
        model.addAttribute("user", userService.findById(id));
        return "relationship_sql/onetomany/user/user_one_one_view";
    }

    //to delete a particular user using user_id
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return "redirect:/user_one_one";
    }

}
