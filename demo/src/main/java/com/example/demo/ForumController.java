package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.security.Principal;

@RestController
@RequestMapping("/api")
public class ForumController {

    @Autowired
    private ForumPostRepository forumPostRepository;

    @PostMapping("/forumPosts")
    public ForumPost addForumPost(@RequestBody ForumPost forumPost, Principal principal) {
        // Ελέγχουμε αν ο χρήστης είναι συνδεδεμένος.
        if (principal == null) {
            throw new RuntimeException("Unauthorized: Ο χρήστης δεν είναι συνδεδεμένος.");
        }
        // Θέτουμε το username από τον συνδεδεμένο χρήστη.
        forumPost.setUsername(principal.getName());
        // Θέτουμε το timestamp της καταχώρησης.
        forumPost.setTimestamp(System.currentTimeMillis());
        return forumPostRepository.save(forumPost);
    }

    @GetMapping("/forumPosts")
    public List<ForumPost> getForumPosts(@RequestParam(required = false) String department,
                                         @RequestParam(required = false) String university) {
        if (department != null && university != null) {
            return forumPostRepository.findByDepartmentAndUniversity(department, university);
        } else if (department != null) {
            return forumPostRepository.findByDepartment(department);
        } else {
            return forumPostRepository.findAll();
        }
    }
}
