package lk.frist_day_project.frist_day.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWordController {

    @GetMapping("/hello")
    public String firstMethod(Model model){
model.addAttribute("name","Saman");
        return "hello_world/hello_world";
    }

    @PostMapping("/helloPost")
    public String post(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "hello_world/hello_world";
    }

    @GetMapping("/helloGet")
    public String get(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "hello_world/hello_world";
    }


}
