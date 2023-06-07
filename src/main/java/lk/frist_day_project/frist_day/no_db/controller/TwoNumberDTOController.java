package lk.frist_day_project.frist_day.no_db.controller;

import lk.frist_day_project.frist_day.no_db.DTO.TwoNumberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/new")
public class TwoNumberDTOController {

    @GetMapping("/multiplicationDTO")
    public String multiplicationDTO(Model model) {
 model.addAttribute("targetObject",new TwoNumberDTO());
        return "twoNumberDTO/twoNumberDTO";
    }

    @PostMapping("/multiplicationDTO")
    public String multiplicationDTO(@ModelAttribute TwoNumberDTO twoNumberDTO,
                                    Model model) {

        model.addAttribute("targetObject",twoNumberDTO);
        model.addAttribute("result",
                twoNumberDTO.getNumberOne1() * twoNumberDTO.getNumberOne2());
        return "twoNumberDTO/twoNumberDTO";
    }
}
