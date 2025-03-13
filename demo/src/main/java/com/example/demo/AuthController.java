package com.example.demo;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    // GET mapping για την εμφάνιση της σελίδας login
    @GetMapping("/login")
    public String login(Model model) {
         return "login"; // Επιστρέφει το login.html από τα templates
    }

    // POST mapping για την επεξεργασία του sign in
    @PostMapping("/login")
    public String loginProcess(@RequestParam("username") String username,
                               @RequestParam("password") String password,
                               HttpSession session,
                               Model model) {
         // Εδώ υλοποίησε την δική σου λογική επικύρωσης (π.χ. έλεγχος βάσης δεδομένων)
         // Το παρακάτω είναι απλώς ένα παράδειγμα για έλεγχο:
         if (isValidUser(username, password)) {
              // Αποθήκευση του username στη συνεδρία
              session.setAttribute("username", username);
              // Ανακατεύθυνση στην αρχική σελίδα (π.χ. index.html) όπου στο header θα εμφανίζεται το username
              return "redirect:/";
         } else {
              // Σε περίπτωση λανθασμένων στοιχείων, επιστροφή στην σελίδα login με μήνυμα λάθους
              model.addAttribute("error", "Λανθασμένο username ή password");
              return "login";
         }
    }

    // GET mapping για την εμφάνιση της φόρμας εγγραφής
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
         model.addAttribute("user", new User());
         return "register"; // Επιστρέφει το register.html από τα templates
    }

    // Μέθοδος ελέγχου χρήστη – θα πρέπει να την υλοποιήσεις σύμφωνα με τις απαιτήσεις σου
    private boolean isValidUser(String username, String password) {
         // Για παράδειγμα, έλεγχος σταθερών τιμών. Αντικατάστησέ το με έλεγχο στη βάση δεδομένων ή άλλο μηχανισμό επαλήθευσης.
         return "user".equals(username) && "password".equals(password);
    }
}
