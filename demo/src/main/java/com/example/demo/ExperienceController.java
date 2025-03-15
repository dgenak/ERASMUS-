package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import jakarta.validation.Valid;

@Controller
public class ExperienceController {

    // Εμφάνιση της φόρμας για "Μοιράσου την εμπειρία σου"
    @GetMapping("/experience/share")
    public String showExperienceForm(Model model) {
        model.addAttribute("experience", new Experience());
        return "experienceForm"; // Αναφέρεται στο template (HTML) για την φόρμα
    }

    // Διαχείριση υποβολής φόρμας
    @PostMapping("/experience/share")
    public String submitExperience(@Valid @ModelAttribute("experience") Experience experience, 
                                   BindingResult result, 
                                   Model model) {
        if (result.hasErrors()) {
            // Επιστροφή στην ίδια φόρμα σε περίπτωση σφαλμάτων εισαγωγής
            return "experienceForm";
        }
        // Επεξεργασία ή αποθήκευση της εμπειρίας (π.χ. σε βάση δεδομένων)
        model.addAttribute("message", "Η εμπειρία σου υποβλήθηκε με επιτυχία!");
        return "experienceSuccess"; // Template που επιβεβαιώνει την επιτυχή υποβολή
    }
}
