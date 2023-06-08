package lk.frist_day_project.frist_day.with_jqueary;

import lk.frist_day_project.frist_day.with_db.entity.DemoEntity;
import lk.frist_day_project.frist_day.with_db.service.DemoService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class WithJQueryController {
    private final DemoService demoService;

    @GetMapping("/jq_data_page")
    public String getHtmlPage(){
        return "with_jqueary/with_jqueary";
    }
    @GetMapping("/jq_data")
    @ResponseBody
    public int getData(){
        return 10;
    }
   @PostMapping("/jq_data")
    @ResponseBody
    public int postData(@RequestParam("number") Integer number){
        return 10 * number;
    }
    @PostMapping("/jq_data_db")
    @ResponseBody
    public DemoEntity postDataDb(@RequestParam("number") Long number){

        return demoService.findById(number);
    }

    @PostMapping("/jq_data_input")
    @ResponseBody
    public DemoEntity postDataInput(@ModelAttribute DemoEntity demoEntity){
        System.out.println(demoEntity.getId() + "  id");
        return demoService.findById(demoEntity.getId());
    }


}
