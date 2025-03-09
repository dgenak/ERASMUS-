package com.example.demo;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MyUserDetails implements UserDetails {

    // Το registrationNumber χρησιμοποιείται ως login key
    private final String registrationNumber;

    // Το εμφανιζόμενο όνομα
    private final String displayName;

    private final String password;
    private final List<GrantedAuthority> authorities;

    public MyUserDetails(User user) {
        this.registrationNumber = user.getRegistrationNumber();
        this.displayName = user.getUsername(); // Το όνομα που θα εμφανίζεται
        this.password = user.getPassword();
        this.authorities = user.getRoles().stream()
            .map(role -> new SimpleGrantedAuthority("ROLE_" + role))
            .collect(Collectors.toList());
    }

    // Το Spring Security χρησιμοποιεί αυτήν τη μέθοδο για το login, οπότε επιστρέφουμε το registrationNumber.
    @Override
    public String getUsername() {
        return registrationNumber;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() { 
        return true; 
    }

    @Override
    public boolean isAccountNonLocked() { 
        return true; 
    }

    @Override
    public boolean isCredentialsNonExpired() { 
        return true; 
    }

    @Override
    public boolean isEnabled() { 
        return true; 
    }

    // Getter για το εμφανιζόμενο όνομα (displayName)
    public String getDisplayName() {
        return displayName;
    }
}
