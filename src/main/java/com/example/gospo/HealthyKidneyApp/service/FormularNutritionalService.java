package com.example.gospo.HealthyKidneyApp.service;

import com.example.gospo.HealthyKidneyApp.model.FormularNutritional;
import com.example.gospo.HealthyKidneyApp.model.User;
import com.example.gospo.HealthyKidneyApp.repository.FormularNutritionalRepository;
import com.example.gospo.HealthyKidneyApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.text.Normalizer;
import java.util.List;
import java.util.Optional;

/* Logica formularului nutritional */
@Service
public class FormularNutritionalService {
    @Autowired
    private FormularNutritionalRepository formularNutritionalRepository;

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    private UserRepository userRepository;

    public void saveFormularNutritional(FormularNutritional formularNutritional){
        this.formularNutritionalRepository.save(formularNutritional);
    }

    public FormularNutritional getFormularByUserId(long userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return user.getForm();
        } else {
            throw new RuntimeException("User not found for id: " + userId);
        }
    }

    public String interpretare(FormularNutritional formular){
        String interpretareFinala = "";
        double IMC = formular.calculatorIMC(formular.getGreutate(), formular.getInaltime());
        String valoareIMC = formular.calculareIMC(IMC);
        String interpretareIMC="";
        switch(valoareIMC){
            case "Subponderal" : interpretareIMC = "Greutatea dumneavoastra este prea mica, recomandam un consult nutritional.";
            break;
            case "Greutate normala" : interpretareIMC = "Greutatea dumneavoastra este normala.";
            break;
            case "Supraponderal" : interpretareIMC = "Greutatea dumneavoastra este prea mare fiind un factor de risc, recomandam un regim alimentar si activitate fizica.";
            break;
            case "Obezitate" : interpretareIMC ="Greutatea corporala este foarte mare fiind un factor major de risc, recomandam un consult nutritional.";
            break;
            default:interpretareIMC="Greutatea coprorala este normala.";
        }
        interpretareFinala += interpretareIMC;
        int cantitateApa = formular.getCantitateApa();
        switch (cantitateApa){
            case 2: interpretareFinala+= " Cantitatea de apa este prea mica ceea ce constituie un factor de risc major, recomandat este 2,5 litri pe zi.";
            break;
            case 4:interpretareFinala+= " Cantitatea de apa este prea mica ceea ce constituie un factor de risc major, recomandat este 2,5 litri pe zi.";
            break;
            case 6:interpretareFinala+= " Cantitatea de apa este prea mica ceea ce constituie un factor de risc major, recomandat este 2,5 litri pe zi.";
            break;
            case 8: interpretareFinala+= " Cantitatea de apa este aproape suficienta, puteti creste pana la 10 cani pentru a ajunge la 2,5 litri pe zi.";
            break;
        }

        String citrice = formular.interpretareCitrice(formular.getConsumSucuriNaturale(), formular.getCantitateSucuriNaturale());
        interpretareFinala += citrice;

        String lapte = formular.interpretareLapte(formular.getCantitateLapte());

        interpretareFinala += lapte;

        String nrMese = formular.interpretareNrMese(formular.getCantitateMese());
        interpretareFinala+=nrMese;

        String cantitateLegumeSaptamana = formular.interpretareCantitateLegumeSaptamana(formular.getCantitateLegumeSaptamana());
        interpretareFinala+=cantitateLegumeSaptamana;

        String cantitateLegumeZi = formular.interpretareCantitateLegumeZi(formular.getCantitateLegumeZi());
        interpretareFinala+=cantitateLegumeZi;

        String cantitateFructeSaptamana = formular.interpretareCantitateFructeSaptamana(formular.getCantitateFructeSaptamana());
        interpretareFinala+=cantitateFructeSaptamana;

        String cantitateCarneSaptamana = formular.interpretareCantitateCarneSaptamana(formular.getCantitateCarneSaptamana());
        interpretareFinala+=cantitateCarneSaptamana;

        String cantitateOuaSaptamana = formular.interpretareCantitateOuaSaptamana(formular.getCantitateOua());
        interpretareFinala+=cantitateOuaSaptamana;

        String cantitateSare = formular.interpretareCantitateSare(formular.getCantitateSare());
        interpretareFinala+=cantitateSare;

        String cantitatePaine = formular.interpretareCantitatePaine(formular.getCantitatePaine());
        interpretareFinala+=cantitatePaine;

        return interpretareFinala;
    }
}
