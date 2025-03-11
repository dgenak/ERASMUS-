package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.Set;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.Authentication;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, RedirectAttributes redirectAttributes) {
         // Ελέγχουμε αν υπάρχει ήδη χρήστης με το ίδιο username (login key)
         if(userRepository.findByUsername(user.getUsername()) != null){
             redirectAttributes.addFlashAttribute("error", "Το username υπάρχει ήδη.");
             return "redirect:/register";
         }
         
         // Αποθηκεύουμε τον raw κωδικό για το auto login
         String rawPassword = user.getPassword();
         
         // Κωδικοποίηση και αποθήκευση του χρήστη
         user.setPassword(passwordEncoder.encode(user.getPassword()));
         user.setRoles(Set.of("USER"));
         userRepository.save(user);
         
         // Auto login: Χρησιμοποιούμε το username για το authentication
         UsernamePasswordAuthenticationToken authToken =
             new UsernamePasswordAuthenticationToken(user.getUsername(), rawPassword);
         Authentication authentication = authenticationManager.authenticate(authToken);
         SecurityContextHolder.getContext().setAuthentication(authentication);
         
         // Ανακατεύθυνση στην αρχική σελίδα
         return "redirect:/";
    }
}
