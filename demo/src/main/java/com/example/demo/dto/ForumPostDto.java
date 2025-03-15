package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class ForumPostDto {

    @NotBlank(message = "Ο τύπος του post είναι υποχρεωτικός.")
    private String type; // "question" ή "experience"

    // Για ερώτηση
    private String title;
    private String body;

    // Για εμπειρία
    private String department;
    private String university;
    private String experience;

    // Getters & Setters
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
}
