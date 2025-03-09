package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ForumController {

    @Autowired
    private ForumPostRepository forumPostRepository;

    @PostMapping("/forumPosts")
    public ForumPost addForumPost(@RequestBody ForumPost forumPost) {
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
