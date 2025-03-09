package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
         return "login"; // Επιστρέφει το login.html από τα templates
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
         model.addAttribute("user", new User());
         return "register"; // Επιστρέφει το register.html από τα templates
    }
}
