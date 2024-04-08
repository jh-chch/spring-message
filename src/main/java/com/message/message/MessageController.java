package com.message.message;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MessageController {

    @Autowired
    LocaleResolver localeResolver;

    @GetMapping("/message")
    public String getMethodName(HttpServletRequest request, HttpServletResponse response
                        , Model model, @RequestParam String lang) {
        // localeResolver.setLocale(request, response, new Locale(lang));        
        model.addAttribute("name", "CHOI");

        return "message";
    }

}
