package lk.frist_day_project.frist_day.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FirstController {

    @GetMapping("/")
    public String firstMethod(){
        return "index";
    }


    @GetMapping("/app")
    public String firstDirectory(){
        return "app/index";
    }


}
