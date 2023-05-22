package lk.frist_day_project.frist_day.controller;

import lk.frist_day_project.frist_day.DTO.TwoNumberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWordController {

    @GetMapping("/hello")
    public String firstMethod(Model model) {
        model.addAttribute("name", "Saman");
        return "hello_world/hello_world";
    }

    @PostMapping("/helloPost")
    public String post(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello_world/hello_world";
    }

    @GetMapping("/helloGet")
    public String get(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello_world/hello_world";
    }

    @PostMapping("/multiplicationByTwo")
    public String numberMultiplicationWithTwo(@RequestParam("numberOne") int numberOne, Model model) {
        model.addAttribute("result", numberOne * 2);
        return "hello_world/hello_world";
    }
    @PostMapping("/multiplication")
    public String numberMultiplication(@RequestParam("numberOne") int numberOne,
                                       @RequestParam("numberTwo") int numberTwo,
                                       Model model) {
        model.addAttribute("result", numberOne * numberTwo);
        return "hello_world/hello_world";
    }
    @PostMapping("/multiplicationDTO")
    public String multiplicationDTO(@ModelAttribute TwoNumberDTO twoNumberDTO,
                                    Model model) {

        model.addAttribute("result",
                twoNumberDTO.getNumberOne1() * twoNumberDTO.getNumberOne2());
        return "hello_world/hello_world";
    }


}
