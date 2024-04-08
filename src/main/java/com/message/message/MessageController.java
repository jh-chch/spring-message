package com.message.message;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MessageController {

    @GetMapping("/message")
    public String getMethodName(Model model) {
        model.addAttribute("name", "CHOI");
        return "message";
    }
    
}
