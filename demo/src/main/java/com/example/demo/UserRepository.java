package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // Αναζήτηση χρήστη βάσει του username (login key)
    User findByUsername(String username);

    // Μπορείς να έχεις και μέθοδο για τον αριθμό μητρώου αν χρειαστεί
    User findByRegistrationNumber(String registrationNumber);
}
