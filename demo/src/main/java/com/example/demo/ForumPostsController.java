package com.example.demo;

import com.example.demo.model.ForumPost;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/forum")
public class ForumPostsController {

    // Χρησιμοποιούμε thread-safe λίστα για τα posts (για demo σκοπούς)
    private static List<ForumPost> posts = new CopyOnWriteArrayList<>();
    private static AtomicLong idGenerator = new AtomicLong();

    @GetMapping
    public String showForum(Model model) {
        model.addAttribute("posts", posts);
        return "forum"; // Το Thymeleaf θα ψάξει για το src/main/resources/templates/forum.html
    }

    @PostMapping
    public String addPost(@RequestParam("message") String message, HttpSession session, Model model) {
        if (message == null || message.trim().isEmpty()) {
            model.addAttribute("error", "Το μήνυμα δεν μπορεί να είναι κενό.");
            model.addAttribute("posts", posts);
            return "forum"; // Επανεμφάνιση της σελίδας με το μήνυμα λάθους
        }

        String username = (String) session.getAttribute("username");
        if (username == null || username.trim().isEmpty()) {
            username = "Anonymous";
        }

        ForumPost post = new ForumPost();
        post.setId(idGenerator.incrementAndGet());
        post.setUsername(username);
        post.setMessage(message);
        post.setTimestamp(LocalDateTime.now());
        post.setLikeCount(0);

        // Προσθέτουμε το νέο post στην αρχή της λίστας ώστε να εμφανίζεται πάνω
        posts.add(0, post);

        return "redirect:/forum";
    }

    @PostMapping("/like")
    public String likePost(@RequestParam("postId") Long postId) {
        posts.stream()
             .filter(post -> post.getId().equals(postId))
             .findFirst()
             .ifPresent(post -> post.setLikeCount(post.getLikeCount() + 1));
        return "redirect:/forum";
    }
}
