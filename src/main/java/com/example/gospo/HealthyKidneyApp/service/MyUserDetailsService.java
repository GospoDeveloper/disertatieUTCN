package com.example.gospo.HealthyKidneyApp.service;

import com.example.gospo.HealthyKidneyApp.model.User;
import com.example.gospo.HealthyKidneyApp.model.UserPrincipal;
import com.example.gospo.HealthyKidneyApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/*

Rolul principal al interfeței UserDetailsService este de a încărca date specifice utilizatorului.
Această clasă implementează interfața UserDetailsService și suprascrie metoda loadUserByUsername.
Când un utilizator încearcă să se autentifice, Spring Security apelează această metodă
cu numele de utilizator (sau e-mail în cazul de fata) pentru a prelua detaliile utilizatorului din baza de date.
Dacă utilizatorul este găsit, returnează un obiect UserPrincipal care conține informații
despre utilizator necesare pentru autentificare și autorizare.
Dacă utilizatorul nu este găsit, acesta lansează o excepție UsernameNotFoundException.
 */
@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = repository.findByEmail(email);
        if(user == null){
            System.out.println("User 404");
            throw  new UsernameNotFoundException("User 404");
        }
        return new UserPrincipal(user);
    }

    public Long getCurrentUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {

            MyUserDetailsService userDetails = (MyUserDetailsService) authentication.getPrincipal();
            return userDetails.getCurrentUserId();
        }
        return null;
    }
}
