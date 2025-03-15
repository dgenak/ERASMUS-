package com.example.demo;

import com.example.demo.dto.ForumPostDto;
import com.example.demo.model.ForumPost;
import com.example.demo.ForumPostRepository;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/forum")
public class ForumPostsController {

    private final ForumPostRepository forumPostRepository;
    private static final AtomicLong idGenerator = new AtomicLong();

    public ForumPostsController(ForumPostRepository forumPostRepository) {
        this.forumPostRepository = forumPostRepository;
    }

    @GetMapping
    public String showForum(Model model) {
        List<ForumPost> posts = forumPostRepository.findAll();
        model.addAttribute("posts", posts);
        // Δέσμευση μιας νέας φόρμας για δημιουργία νέου post
        model.addAttribute("forumPostDto", new ForumPostDto());
        return "forum";
    }

    @PostMapping("/add")
    public String addPost(@Valid @ModelAttribute("forumPostDto") ForumPostDto forumPostDto,
                          BindingResult bindingResult,
                          HttpSession session,
                          Model model) {
        if (bindingResult.hasErrors()) {
            // Εάν υπάρχουν σφάλματα, επανεμφανίζουμε τη σελίδα μαζί με τα posts και τα errors
            List<ForumPost> posts = forumPostRepository.findAll();
            model.addAttribute("posts", posts);
            return "forum";
        }

        String username = (String) session.getAttribute("username");
        if (username == null || username.trim().isEmpty()) {
            username = "Anonymous";
        }

        ForumPost post = new ForumPost();
        post.setId(idGenerator.incrementAndGet());
        post.setUsername(username);
        post.setType(forumPostDto.getType());
        if ("question".equalsIgnoreCase(forumPostDto.getType())) {
            post.setTitle(forumPostDto.getTitle());
            post.setBody(forumPostDto.getBody());
        } else if ("experience".equalsIgnoreCase(forumPostDto.getType())) {
            post.setDepartment(forumPostDto.getDepartment());
            post.setUniversity(forumPostDto.getUniversity());
            post.setExperience(forumPostDto.getExperience());
        }
        post.setTimestamp(LocalDateTime.now());
        post.setLikeCount(0);

        forumPostRepository.save(post);
        return "redirect:/forum";
    }

    @PostMapping("/like")
    public String likePost(@RequestParam("postId") Long postId) {
        ForumPost post = forumPostRepository.findById(postId).orElse(null);
        if (post != null) {
            post.setLikeCount(post.getLikeCount() + 1);
            forumPostRepository.save(post);
        }
        return "redirect:/forum";
    }
}

