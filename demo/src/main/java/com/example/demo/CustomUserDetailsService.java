package com.example.demo;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String registrationNumber) throws UsernameNotFoundException {
         // Βρίσκουμε τον χρήστη βάσει του registrationNumber
         User user = userRepository.findByRegistrationNumber(registrationNumber);
         if (user == null) {
             throw new UsernameNotFoundException("User not found: " + registrationNumber);
         }
         return new MyUserDetails(user);
    }
}
