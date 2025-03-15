package com.example.demo;

// Αντί για javax.validation.*
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;


public class Experience {
    
    @NotBlank(message = "Το περιεχόμενο της εμπειρίας δεν μπορεί να είναι κενό.")
    private String content;

    // Getters και Setters
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
