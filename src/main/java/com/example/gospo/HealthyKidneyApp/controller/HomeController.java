package com.example.gospo.HealthyKidneyApp.controller;

import com.example.gospo.HealthyKidneyApp.model.FormularNutritional;
import com.example.gospo.HealthyKidneyApp.model.User;
import com.example.gospo.HealthyKidneyApp.model.UserPrincipal;
import com.example.gospo.HealthyKidneyApp.repository.FormularNutritionalRepository;
import com.example.gospo.HealthyKidneyApp.repository.UserRepository;
import com.example.gospo.HealthyKidneyApp.service.FormularNutritionalService;
import com.example.gospo.HealthyKidneyApp.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.security.Principal;
import java.util.Collection;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private FormularNutritionalService formularNutritionalService;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private FormularNutritionalRepository formularNutritionalRepository;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/formular-nou")
    public String formularNou(Model model, Principal principal){
        User currentUser = userRepository.findByEmail(principal.getName());
        FormularNutritional formular = formularNutritionalService.getFormularByUserId(currentUser.getId());

        var newFormular = new FormularNutritional();
        newFormular.setId(formular.getId());
        model.addAttribute("formular", newFormular);

        return "formular";
    }


    @GetMapping("/formular")
    public String formular( Model model, Principal principal){

        // preia userul current logat
        String email = principal.getName();
        System.out.println(email);

        //cautare user in db
        User currentUser = userRepository.findByEmail(email);
        System.out.println(currentUser);

        // cauare id de la user
        Long userId = currentUser.getId();
        System.out.println(userId);

        // preluare formular nutritional asociat cu user id
        FormularNutritional formular = formularNutritionalService.getFormularByUserId(userId);
        System.out.println(formular.getId());
        System.out.println(formular);

        //adauga formularul la model
        model.addAttribute("formular", formular);
        return "formular";
    }

    @GetMapping("/formular_success")
    public String formularSuccess(Model model,Principal principal) {
        String email = principal.getName();
        User currentUser = userRepository.findByEmail(email);
        Long userId = currentUser.getId();
        FormularNutritional formularNutritional = formularNutritionalService.getFormularByUserId(userId);
        String rezultat =formularNutritionalService.interpretare(formularNutritional);
        model.addAttribute("rezultat", rezultat);
        return "formular_success";
    }
}


