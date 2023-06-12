package lk.frist_day_project.frist_day.relationship_sql.manytomany.task.controller;



import lk.frist_day_project.frist_day.relationship_sql.manytomany.task.entity.TaskMM;
import lk.frist_day_project.frist_day.relationship_sql.manytomany.task.service.TaskMMService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/task_many_many")
@AllArgsConstructor
public class TaskMMController {

    private final TaskMMService taskService;

    // to get all data from db to visualize in FE
    @GetMapping
    public String findAll(Model mode) {
        mode.addAttribute("tasks", taskService.findAll());
        return "relationship_sql/manytomany/task/task_one_one";
    }

    //get a form to add a new task to db
    @GetMapping("/add")
    public String form(Model model) {
        model.addAttribute("addStatus", true);
        model.addAttribute("task", new TaskMM());
        return "relationship_sql/manytomany/task/task_one_one_add";
    }

    //to persist task details 
    @PostMapping
    public String persist(@ModelAttribute TaskMM task) {
        taskService.persist(task);
        return "redirect:/task_one_one";
    }

    //to edit a particular task using task_id
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        model.addAttribute("addStatus", "true_one");
        model.addAttribute("task", taskService.findById(id));
        return "relationship_sql/manytomany/task/task_one_one_add";
    }

    //to view details a particular task using task_id
    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") Long id,Model model) {
        model.addAttribute("user", taskService.findById(id));
        return "relationship_sql/manytomany/task/task_one_one_view";
    }

    //to delete a particular task using task_id
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        taskService.deleteById(id);
        return "redirect:/task_one_one";
    }

}
