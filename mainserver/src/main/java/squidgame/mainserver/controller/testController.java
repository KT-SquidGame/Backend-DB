package squidgame.mainserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
    @GetMapping("/hello")
    public String test1(){
        return "hello";
    }
}
