package com.example.demo;

import com.example.demo.model.ForumPost;
import com.example.demo.model.ForumReply;
import com.example.demo.ForumPostRepository;
import com.example.demo.ForumReplyRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/forum/reply")
public class ForumReplyController {

    private final ForumReplyRepository forumReplyRepository;
    private final ForumPostRepository forumPostRepository;
    private static final AtomicLong replyIdGenerator = new AtomicLong();

    public ForumReplyController(ForumReplyRepository forumReplyRepository,
                                ForumPostRepository forumPostRepository) {
        this.forumReplyRepository = forumReplyRepository;
        this.forumPostRepository = forumPostRepository;
    }

    /**
     * Παράδειγμα: Ο χρήστης κάνει POST σε /forum/reply/add
     * με τα πεδία postId και reply στο body του form (ως request parameters).
     */
    @PostMapping("/add")
    public String addReply(@RequestParam("postId") Long postId,
                           @RequestParam("reply") String replyText,
                           HttpSession session,
                           Model model) {

        // 1) Εντοπίζουμε το ForumPost
        ForumPost post = forumPostRepository.findById(postId).orElse(null);
        if (post == null) {
            // Αν δεν βρέθηκε το post, εμφανίζουμε μήνυμα ή κάνουμε redirect
            model.addAttribute("error", "Δεν βρέθηκε το συγκεκριμένο Post για απάντηση.");
            return "redirect:/forum";
        }

        // 2) Βρίσκουμε το username από το session (ή αν δεν υπάρχει, "Anonymous")
        String username = (String) session.getAttribute("username");
        if (username == null || username.trim().isEmpty()) {
            username = "Anonymous";
        }

        // 3) Δημιουργούμε το ForumReply
        ForumReply reply = new ForumReply();
        reply.setId(replyIdGenerator.incrementAndGet()); // απλό generator για demo
        reply.setUsername(username);
        reply.setReply(replyText);
        reply.setTimestamp(LocalDateTime.now());
        reply.setForumPost(post);

        // 4) Αποθηκεύουμε την απάντηση
        forumReplyRepository.save(reply);

        // 5) Επιστρέφουμε στο forum
        return "redirect:/forum";
    }
}
