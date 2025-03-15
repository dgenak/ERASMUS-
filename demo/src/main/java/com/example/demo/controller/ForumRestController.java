package com.example.demo.controller;

import com.example.demo.dto.ForumPostDto;
import com.example.demo.model.ForumPost;
import com.example.demo.model.ForumReply;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/forumPosts")
public class ForumRestController {

    // Χρήση thread-safe λίστας για demo σκοπούς
    private static final List<ForumPost> posts = new CopyOnWriteArrayList<>();
    private static final AtomicLong postIdGenerator = new AtomicLong();
    private static final AtomicLong replyIdGenerator = new AtomicLong();

    // GET: Ανάκτηση όλων των posts
    @GetMapping
    public List<ForumPost> getAllPosts() {
        return posts;
    }

    // POST: Δημιουργία νέου post (είτε ερώτηση είτε εμπειρία)
    @PostMapping
    public ResponseEntity<?> createPost(@Valid @RequestBody ForumPostDto dto, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body("Validation errors: " + result.getAllErrors());
        }

        ForumPost post = new ForumPost();
        post.setId(postIdGenerator.incrementAndGet());
        // Προσαρμόστε εδώ την λήψη του username (π.χ. από session ή authentication)
        post.setUsername("Anonymous");
        post.setTimestamp(LocalDateTime.now());
        post.setLikeCount(0);

        // Διαχωρισμός με βάση τον τύπο του post
        if ("question".equalsIgnoreCase(dto.getType())) {
            // Έλεγχος για υποχρεωτικά πεδία ερώτησης
            if (dto.getTitle() == null || dto.getTitle().trim().isEmpty()
                || dto.getBody() == null || dto.getBody().trim().isEmpty()) {
                return ResponseEntity.badRequest().body(
                    "Τα πεδία 'title' και 'body' είναι υποχρεωτικά για ερώτηση."
                );
            }
            post.setType("question");
            post.setTitle(dto.getTitle());
            post.setBody(dto.getBody());
        } else if ("experience".equalsIgnoreCase(dto.getType())) {
            // Έλεγχος για υποχρεωτικά πεδία εμπειρίας
            if (dto.getDepartment() == null || dto.getDepartment().trim().isEmpty()
                || dto.getUniversity() == null || dto.getUniversity().trim().isEmpty()
                || dto.getExperience() == null || dto.getExperience().trim().isEmpty()) {
                return ResponseEntity.badRequest().body(
                    "Τα πεδία 'department', 'university' και 'experience' είναι υποχρεωτικά για εμπειρία."
                );
            }
            post.setType("experience");
            post.setDepartment(dto.getDepartment());
            post.setUniversity(dto.getUniversity());
            post.setExperience(dto.getExperience());
        } else {
            return ResponseEntity.badRequest().body(
                "Invalid post type. Χρησιμοποιήστε 'question' ή 'experience'."
            );
        }

        // Προσθήκη του νέου post στην αρχή της λίστας
        posts.add(0, post);

        return ResponseEntity.ok(post);
    }

    // POST: Αύξηση του like για ένα post
    @PostMapping("/like")
    public ResponseEntity<?> likePost(@RequestParam("postId") Long postId) {
        for (ForumPost post : posts) {
            if (post.getId().equals(postId)) {
                post.setLikeCount(post.getLikeCount() + 1);
                return ResponseEntity.ok(post);
            }
        }
        return ResponseEntity.badRequest().body("Post not found");
    }

    @PostMapping("/reply")
    public ResponseEntity<?> addReply(@RequestParam("postId") Long postId,
                                      @RequestParam("reply") String replyBody) {
        for (ForumPost post : posts) {
            if (post.getId().equals(postId)) {
                ForumReply reply = new ForumReply();
                reply.setId(replyIdGenerator.incrementAndGet());
                // Προσαρμόστε εδώ την λήψη του username για την απάντηση
                reply.setUsername("Anonymous");
                // Αντί για setBody(), χρησιμοποιούμε setReply()
                reply.setReply(replyBody);
                reply.setTimestamp(LocalDateTime.now());
                post.getReplies().add(reply);
                return ResponseEntity.ok(reply);
            }
        }
        return ResponseEntity.badRequest().body("Post not found");
    }
    
}
