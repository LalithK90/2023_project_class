package lk.frist_day_project.frist_day.with_db.controller;

import lk.frist_day_project.frist_day.with_db.entity.DemoEntity;
import lk.frist_day_project.frist_day.with_db.service.DemoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/demo")
@AllArgsConstructor
public class DemoController {

    private final DemoService demoService;


    @GetMapping
    public String form(Model model){

        model.addAttribute("addStatus", "true_two");
        model.addAttribute("demoEntity", new DemoEntity());
        model.addAttribute("demoEntities",demoService.findAll());
        return "with_db/demo_entity";
    }

    @PostMapping
    public String persist(@ModelAttribute DemoEntity demoEntity){
       demoService.persist(demoEntity);
        return "redirect:/demo";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id,Model model){
        model.addAttribute("addStatus", "true_one");
        model.addAttribute("demoEntity", demoService.findById(id));
        model.addAttribute("demoEntities",demoService.findAll());
        return "with_db/demo_entity";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        demoService.deleteById(id);
        return "redirect:/demo";
    }

}
