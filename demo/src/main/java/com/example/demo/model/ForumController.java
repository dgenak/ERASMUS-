package com.example.demo.model;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class ForumController {

    // Χρησιμοποιούμε μια απλή in-memory λίστα για τα posts.
    private static List<ForumPost> posts = new ArrayList<>();
    private static AtomicLong idGenerator = new AtomicLong();

    @GetMapping("/forum")
    public String showForum(Model model) {
        model.addAttribute("posts", posts);
        return "forum"; // Το Thymeleaf θα ψάξει για src/main/resources/templates/forum.html
    }

    @PostMapping("/forum")
    public String addPost(@RequestParam("message") String message, HttpSession session) {
        // Παίρνουμε το username από τη συνεδρία (ή την ασφαλή συνδρομή)
        String username = (String) session.getAttribute("username");
        if (username == null) {
            username = "Anonymous";
        }
        ForumPost post = new ForumPost();
        post.setId(idGenerator.incrementAndGet());
        post.setUsername(username);
        post.setMessage(message);
        post.setTimestamp(LocalDateTime.now());
        post.setLikeCount(0);
        // Προσθέτουμε το νέο post στην αρχή της λίστας (για να εμφανίζεται πάνω)
        posts.add(0, post);
        return "redirect:/forum";
    }

    @PostMapping("/forum/like")
    public String likePost(@RequestParam("postId") Long postId) {
        for (ForumPost post : posts) {
            if (post.getId().equals(postId)) {
                post.setLikeCount(post.getLikeCount() + 1);
                break;
            }
        }
        return "redirect:/forum";
    }
}
