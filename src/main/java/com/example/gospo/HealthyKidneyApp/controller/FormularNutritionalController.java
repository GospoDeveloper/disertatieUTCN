package com.example.gospo.HealthyKidneyApp.controller;


import com.example.gospo.HealthyKidneyApp.model.FormularNutritional;
import com.example.gospo.HealthyKidneyApp.model.User;
import com.example.gospo.HealthyKidneyApp.model.UserPrincipal;
import com.example.gospo.HealthyKidneyApp.repository.FormularNutritionalRepository;
import com.example.gospo.HealthyKidneyApp.repository.UserRepository;
import com.example.gospo.HealthyKidneyApp.service.FormularNutritionalService;
import com.example.gospo.HealthyKidneyApp.service.MyUserDetailsService;
import com.example.gospo.HealthyKidneyApp.service.UserService;
import com.example.gospo.HealthyKidneyApp.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.net.URI;
import java.util.Optional;

@Controller
public class FormularNutritionalController {

    @Autowired
    private FormularNutritionalService formularNutritionalService;

    @Autowired
    private UserServiceImpl userServiceImpl;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FormularNutritionalRepository formularNutritionalRepository;


    public FormularNutritionalController(FormularNutritionalService formularNutritionalService) {
        this.formularNutritionalService = formularNutritionalService;
    }

    @PostMapping("/trimiteFormular")
    public ResponseEntity salveazaFormular(@ModelAttribute("formularNutritional") FormularNutritional formularNutritional, RedirectAttributes redirectAttributes) {

        Optional<FormularNutritional> optionalFormular = formularNutritionalRepository.findById(formularNutritional.getId());
        if (optionalFormular.isPresent()) {
            FormularNutritional existingForm = optionalFormular.get();
            existingForm.setAntecedenteCalculi(formularNutritional.getAntecedenteCalculi());
            existingForm.setAntecedenteHeredocolaterale(formularNutritional.getAntecedenteHeredocolaterale());
            existingForm.setAntecedenteInfectie(formularNutritional.getAntecedenteInfectie());
            existingForm.setAntecedenteOperatie(formularNutritional.getAntecedenteOperatie());
            existingForm.setCantitateApa(formularNutritional.getCantitateApa());
            existingForm.setCantitateCarbogazoase(formularNutritional.getCantitateCarbogazoase());
            existingForm.setCantitateCarneSaptamana(formularNutritional.getCantitateCarneSaptamana());
            existingForm.setCantitateCartofiSaptamana(formularNutritional.getCantitateCartofiSaptamana());
            existingForm.setCantitateFructeSaptamana(formularNutritional.getCantitateFructeSaptamana());
            existingForm.setCantitateLapte(formularNutritional.getCantitateLapte());
            existingForm.setCantitateLegumeSaptamana(formularNutritional.getCantitateLegumeSaptamana());
            existingForm.setCantitateLegumeZi(formularNutritional.getCantitateMese());
            existingForm.setCantitateMese(formularNutritional.getCantitateMese());
            existingForm.setCantitateOua(formularNutritional.getCantitateOua());
            existingForm.setCantitatePaine(formularNutritional.getCantitatePaine());
            existingForm.setCantitateRosiiSaptamana(formularNutritional.getCantitateRosiiSaptamana());
            existingForm.setCantitateSare(formularNutritional.getCantitateSare());
            existingForm.setCantitateSucuriNaturale(formularNutritional.getCantitateSucuriNaturale());
            existingForm.setCarbogazoase(formularNutritional.getCarbogazoase());
            existingForm.setConsumSucuriNaturale(formularNutritional.getConsumSucuriNaturale());
            existingForm.setDomiciliu(formularNutritional.getDomiciliu());
            existingForm.setEpisodActual(formularNutritional.getEpisodActual());
            existingForm.setFructeMicDejun(formularNutritional.getFructeMicDejun());
            existingForm.setGradRudenie(formularNutritional.getGradRudenie());
            existingForm.setGreutate(formularNutritional.getGreutate());
            existingForm.setInaltime(formularNutritional.getInaltime());
            existingForm.setMarcaApa(formularNutritional.getMarcaApa());
            existingForm.setOcupatia(formularNutritional.getOcupatia());
            existingForm.setPrezentaInZona(formularNutritional.getPrezentaInZona());
            existingForm.setPrimulEpisodLitiaza(formularNutritional.getPrimulEpisodLitiaza());
            existingForm.setSare(formularNutritional.getSare());
            existingForm.setSexul(formularNutritional.getSexul());
            existingForm.setSursaApa(formularNutritional.getSursaApa());
            existingForm.setTipOperatieAntecedente(formularNutritional.getTipOperatieAntecedente());
            existingForm.setVarsta(formularNutritional.getVarsta());
            existingForm.setLocalizare(formularNutritional.getLocalizare());
            existingForm.setCantitateLegumeZi(formularNutritional.getCantitateLegumeZi());
        }
            formularNutritionalService.saveFormularNutritional(formularNutritional);
            redirectAttributes.addFlashAttribute("message", "Formular updated successfully");

            return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("/formular_success")).build();
        }
    }

