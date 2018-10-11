package com.example.sendform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SendController {

    @GetMapping(value = "/send")
    public String sendForm(Model model) {
        model.addAttribute("authorisationUrl", "https://localhost:9000/api/processing/process");
        model.addAttribute("transactionId", "e87ba625-32dd-4850-b7a9-78d2017375c1");
        return "index";
    }
}
