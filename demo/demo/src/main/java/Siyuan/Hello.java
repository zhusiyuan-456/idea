package Siyuan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/Hello cruel world")
    public String home(){
        return "welcome to Spring boot!";
    }
}
