package com.example.gospo.HealthyKidneyApp.service;

import com.example.gospo.HealthyKidneyApp.model.FormularNutritional;
import com.example.gospo.HealthyKidneyApp.model.Role;
import com.example.gospo.HealthyKidneyApp.model.User;
import com.example.gospo.HealthyKidneyApp.repository.UserRepository;
import com.example.gospo.HealthyKidneyApp.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

/*
UserService conține logica pentru operațiunile utilizatorului, cum ar fi înregistrarea și
preluarea utilizatorului.
Interacționează cu UserRepository.
*/
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User save(UserRegistrationDto userRegistrationDto) {
        User user = new User(userRegistrationDto.getFirstName(), userRegistrationDto.getLastName(), userRegistrationDto.getEmail(), passwordEncoder.encode(userRegistrationDto.getPassword()), Arrays.asList(new Role("ROLE_USER")),new FormularNutritional());
        return userRepository.save(user);
    }
    public Long getUserIdByUsername(String username) {
        //
        //Implementare logica pentru a prelua ID-ul utilizatorului după numele de utilizator din arhiva UserRepository
        User user = userRepository.findByEmail(username);
        if (user != null) {
            return user.getId();
        } else {
            return null;
        }
    }
    public User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated() && authentication.getPrincipal() instanceof UserDetails) {
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            String username = userDetails.getUsername();
            return userRepository.findByEmail(username);
        }
        return null;
    }
}
