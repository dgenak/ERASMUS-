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
         // Ελέγχουμε μοναδικότητα βάσει του registrationNumber
         if(userRepository.findByRegistrationNumber(user.getRegistrationNumber()) != null){
             redirectAttributes.addFlashAttribute("error", "Ο αριθμός μητρώου υπάρχει ήδη.");
             return "redirect:/register";
         }
         
         // Αποθηκεύουμε τον raw κωδικό πριν τον κωδικοποιήσουμε (για το auto login)
         String rawPassword = user.getPassword();
         
         // Κωδικοποιούμε και αποθηκεύουμε τον χρήστη
         user.setPassword(passwordEncoder.encode(user.getPassword()));
         // Ορίζουμε τον ρόλο "USER"
         user.setRoles(Set.of("USER"));
         userRepository.save(user);
         
         // Δημιουργούμε authentication token χρησιμοποιώντας το registrationNumber ως login key
         UsernamePasswordAuthenticationToken authToken =
             new UsernamePasswordAuthenticationToken(user.getRegistrationNumber(), rawPassword);
         Authentication authentication = authenticationManager.authenticate(authToken);
         SecurityContextHolder.getContext().setAuthentication(authentication);
         
         // Ανακατευθύνουμε στην αρχική σελίδα μετά την εγγραφή (auto login)
         return "redirect:/";
    }
}
