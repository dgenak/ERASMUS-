package com.example.demo;

@RestController
@RequestMapping("/api")
public class ForumPostsController {

    @GetMapping("/forumPosts")
    public List<ForumPost> getAllPosts() {
        // Επέστρεψε λίστα από ForumPost (ή ό,τι αντικείμενο έχεις)
        return forumPostService.findAll();
    }

    @GetMapping("/universityInfo")
    public UniversityInfo getUniversityInfo(@RequestParam String university) {
        // Επέστρεψε ένα αντικείμενο με city, description κ.λπ.
        return someService.findInfoByUniversity(university);
    }
}
