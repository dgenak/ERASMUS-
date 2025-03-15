package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "forum_posts")
public class ForumPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String type; // "question" ή "experience"

    // Για ερώτηση
    private String title;
    @Column(length = 2000)
    private String body;

    // Για εμπειρία
    private String department;
    private String university;
    @Column(length = 2000)
    private String experience;

    private LocalDateTime timestamp;
    private int likeCount;

    @OneToMany(mappedBy = "forumPost", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ForumReply> replies = new ArrayList<>();

    // Getters & Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }
    public String getExperience() {
        return experience;
    }
    public void setExperience(String experience) {
        this.experience = experience;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    public int getLikeCount() {
        return likeCount;
    }
    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
    public List<ForumReply> getReplies() {
        return replies;
    }
    public void setReplies(List<ForumReply> replies) {
        this.replies = replies;
    }
}
