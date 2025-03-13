package com.example.demo.model;

import java.time.LocalDateTime;

public class ForumPost {
    private Long id;
    private String username;
    private String message;
    private LocalDateTime timestamp;
    private int likeCount;

    public ForumPost() {
    }

    public ForumPost(Long id, String username, String message, LocalDateTime timestamp, int likeCount) {
        this.id = id;
        this.username = username;
        this.message = message;
        this.timestamp = timestamp;
        this.likeCount = likeCount;
    }

    // Getters and setters

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
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
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
}
