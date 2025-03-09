package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // Αναζήτηση χρήστη βάσει του registrationNumber (login key)
    User findByRegistrationNumber(String registrationNumber);

    // Εάν χρειάζεται και αναζήτηση βάσει του εμφανιζόμενου ονόματος
    User findByUsername(String username);
}
