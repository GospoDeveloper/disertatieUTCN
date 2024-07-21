package com.example.gospo.HealthyKidneyApp.service;

import com.example.gospo.HealthyKidneyApp.model.User;
import com.example.gospo.HealthyKidneyApp.web.dto.UserRegistrationDto;

public interface UserService {

    User save(UserRegistrationDto userRegistrationDto);

    public Long getUserIdByUsername(String username);

}
