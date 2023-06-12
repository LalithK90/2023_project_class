package lk.frist_day_project.frist_day.relationship_sql.onetoone.task.controller;

import lk.frist_day_project.frist_day.relationship_sql.onetoone.task.entity.Task;
import lk.frist_day_project.frist_day.relationship_sql.onetoone.task.service.TaskService;
import lk.frist_day_project.frist_day.relationship_sql.onetoone.task.entity.Task;
import lk.frist_day_project.frist_day.relationship_sql.onetoone.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/task_one_one")
@AllArgsConstructor
public class TaskController {

    private final TaskService taskService;
private final UserService userService;
    // to get all data from db to visualize in FE
    @GetMapping
    public String findAll(Model mode) {
        mode.addAttribute("tasks", taskService.findAll());
        return "relationship_sql/onetoone/task/task_one_one";
    }

    //get a form to add a new task to db
    @GetMapping("/add")
    public String form(Model model) {
        model.addAttribute("addStatus", false);
        model.addAttribute("task", new Task());

        model.addAttribute("users",userService.findAll());
        //todo -  need to modify if a user has a task that user must no present on the FE

        return "relationship_sql/onetoone/task/task_one_one_add";
    }

    //to persist task details 
    @PostMapping
    public String persist(@ModelAttribute Task task) {
        taskService.persist(task);
        return "redirect:/task_one_one";
    }

    //to edit a particular task using task_id
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
          model.addAttribute("addStatus", true);
        model.addAttribute("task", taskService.findById(id));
        model.addAttribute("users",userService.findAll());
        //todo -  need to modify if a user has a task that user must no present on the FE
        return "relationship_sql/onetoone/task/task_one_one_add";
    }

    //to view details a particular task using task_id
    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") Long id,Model model) {
        model.addAttribute("task", taskService.findById(id));
        return "relationship_sql/onetoone/task/task_one_one_view";
    }

    //to delete a particular task using task_id
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        taskService.deleteById(id);
        return "redirect:/task_one_one";
    }

}
