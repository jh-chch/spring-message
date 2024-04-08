package com.message.message;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MessageController {

    @GetMapping("/message")
    public String getMethodName() {
        return "message";
    }
    
}
