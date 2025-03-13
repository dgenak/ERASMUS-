package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/applications")
    public String showApplications() {
        return "applications"; // Το Thymeleaf θα ψάξει για το src/main/resources/templates/applications.html
    }
}
