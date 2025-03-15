package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ForumPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    
    // Πεδίο για να διακρίνουμε αν πρόκειται για "question" ή "experience"
    private String type;
    
    // Χαρακτηριστικά για ερώτηση
    private String title;
    private String body;
    
    // Χαρακτηριστικά για εμπειρία
    private String department;
    private String university;
    private String experience;
    
    private LocalDateTime timestamp;
    private int likeCount;
    
    // Λίστα για τις απαντήσεις του post (υποθέτουμε ότι η κλάση ForumReply έχει οριστεί ως entity ή ως embeddable)
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ForumReply> replies = new ArrayList<>();
    
    // Επιπλέον πεδίο "message" (αν είναι απαραίτητο για τη λογική της εφαρμογής)
    private String message;

    // Κατασκευαστής χωρίς παραμέτρους (απαιτείται από το JPA)
    public ForumPost() {
    }

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
