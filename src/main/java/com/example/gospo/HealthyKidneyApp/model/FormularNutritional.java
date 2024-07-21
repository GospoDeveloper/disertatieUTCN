package com.example.gospo.HealthyKidneyApp.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

/* clasa formular nutitional cu toate metodele */
@Entity
public class FormularNutritional {

    public FormularNutritional() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "varsta")
    private int varsta;

    @Column(name = "sexul")
    private String sexul;

    @Column(name = "domiciliu")
    private String domiciliu;

    @Column(name = "ocupatia")
    private String ocupatia;

    @Column(name = "greutate")
    private int greutate;

    @Column(name = "inaltime")
    private int inaltime;

    @Column(name = "localizare")
    private String localizare;

    @Column(name = "antecedenteCalculi")
    private String antecedenteCalculi;

    @Column(name = "antecedenteInfectie")
    private String antecedenteInfectie;

    @Column(name = "antecedenteOperatie")
    private String antecedenteOperatie;

    @Column(name = "tipOperatieAntecedente")
    private String tipOperatieAntecedente;
    @Column(name = "primulEpisodLitiaza")
    private String primulEpisodLitiaza;

    @Column(name = "episodActual")
    private String episodActual;

    @Column(name = "antecedenteHeredocolaterale")
    private String antecedenteHeredocolaterale;

    @Column(name = "gradRudenie")
    private String gradRudenie;

    @Column(name = "prezentaInZona")
    private String prezentaInZona;

    @Column(name = "cantitateApa")
    private int cantitateApa;

    @Column(name = "sursaApa")
    private String sursaApa;

    @Column(name = "marcaApa")
    private String marcaApa;
    @Column(name = "carbogazoase")
    private String carbogazoase;

    @Column(name = "cantitateCarbogazoase")
    private String cantitateCarbogazoase;
    @Column(name = "consumSucuriNaturale")
    private String consumSucuriNaturale;
    @Column(name = "cantitateSucuriNaturale")
    private int cantitateSucuriNaturale;
    @Column(name = "cantitateLapte")
    private int cantitateLapte;
    @Column(name = "cantitateMese")
    private int cantitateMese;
    @Column(name = "cantitateLegumeSaptamana")
    private int cantitateLegumeSaptamana;
    @Column(name = "cantitateLegumeZi")
    private int cantitateLegumeZi;
    @Column(name = "cantitateRosiiSaptamana")
    private int cantitateRosiiSaptamana;
    @Column(name = "cantitateCartofiSaptamana")
    private int cantitateCartofiSaptamana;
    @Column(name = "cantitateFructeSaptamana")
    private int cantitateFructeSaptamana;
    @Column(name = "fructeMicDejun")
    private String fructeMicDejun;
    @Column(name = "cantitateCarneSaptamana")
    private int cantitateCarneSaptamana;
    @Column(name = "cantitateOua")
    private int cantitateOua;
    @Column(name = "sare")
    private String sare;
    @Column(name = "cantitateSare")
    private int cantitateSare;
    @Column(name = "cantitatePaine")
    private int cantitatePaine;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getSexul() {
        return sexul;
    }

    public void setSexul(String sexul) {
        this.sexul = sexul;
    }

    public String getDomiciliu() {
        return domiciliu;
    }

    public void setDomiciliu(String domiciliu) {
        this.domiciliu = domiciliu;
    }

    public String getOcupatia() {
        return ocupatia;
    }

    public void setOcupatia(String ocupatia) {
        this.ocupatia = ocupatia;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public String getAntecedenteCalculi() {
        return antecedenteCalculi;
    }

    public void setAntecedenteCalculi(String antecedenteCalculi) {
        this.antecedenteCalculi = antecedenteCalculi;
    }

    public String getAntecedenteInfectie() {
        return antecedenteInfectie;
    }

    public void setAntecedenteInfectie(String antecedenteInfectie) {
        this.antecedenteInfectie = antecedenteInfectie;
    }

    public String getAntecedenteOperatie() {
        return antecedenteOperatie;
    }

    public void setAntecedenteOperatie(String antecedenteOperatie) {
        this.antecedenteOperatie = antecedenteOperatie;
    }

    public String getTipOperatieAntecedente() {
        return tipOperatieAntecedente;
    }

    public void setTipOperatieAntecedente(String tipOperatieAntecedente) {
        this.tipOperatieAntecedente = tipOperatieAntecedente;
    }

    public String getPrimulEpisodLitiaza() {
        return primulEpisodLitiaza;
    }

    public void setPrimulEpisodLitiaza(String primulEpisodLitiaza) {
        this.primulEpisodLitiaza = primulEpisodLitiaza;
    }

    public String getEpisodActual() {
        return episodActual;
    }

    public void setEpisodActual(String episodActual) {
        this.episodActual = episodActual;
    }

    public String getAntecedenteHeredocolaterale() {
        return antecedenteHeredocolaterale;
    }

    public void setAntecedenteHeredocolaterale(String antecedenteHeredocolaterale) {
        this.antecedenteHeredocolaterale = antecedenteHeredocolaterale;
    }

    public String getGradRudenie() {
        return gradRudenie;
    }

    public void setGradRudenie(String gradRudenie) {
        this.gradRudenie = gradRudenie;
    }

    public String getPrezentaInZona() {
        return prezentaInZona;
    }

    public void setPrezentaInZona(String prezentaInZona) {
        this.prezentaInZona = prezentaInZona;
    }

    public int getCantitateApa() {
        return cantitateApa;
    }

    public void setCantitateApa(int cantitateApa) {
        this.cantitateApa = cantitateApa;
    }

    public String getSursaApa() {
        return sursaApa;
    }

    public void setSursaApa(String sursaApa) {
        this.sursaApa = sursaApa;
    }

    public String getMarcaApa() {
        return marcaApa;
    }

    public void setMarcaApa(String marcaApa) {
        this.marcaApa = marcaApa;
    }

    public String getCarbogazoase() {
        return carbogazoase;
    }

    public void setCarbogazoase(String carbogazoase) {
        this.carbogazoase = carbogazoase;
    }

    public String getCantitateCarbogazoase() {
        return cantitateCarbogazoase;
    }

    public void setCantitateCarbogazoase(String cantitateCarbogazoase) {
        this.cantitateCarbogazoase = cantitateCarbogazoase;
    }

    public String getConsumSucuriNaturale() {
        return consumSucuriNaturale;
    }

    public void setConsumSucuriNaturale(String consumSucuriNaturale) {
        this.consumSucuriNaturale = consumSucuriNaturale;
    }

    public int getCantitateSucuriNaturale() {
        return cantitateSucuriNaturale;
    }

    public void setCantitateSucuriNaturale(int cantitateSucuriNaturale) {
        this.cantitateSucuriNaturale = cantitateSucuriNaturale;
    }

    public int getCantitateLapte() {
        return cantitateLapte;
    }

    public void setCantitateLapte(int cantitateLapte) {
        this.cantitateLapte = cantitateLapte;
    }

    public int getCantitateMese() {
        return cantitateMese;
    }

    public void setCantitateMese(int cantitateMese) {
        this.cantitateMese = cantitateMese;
    }

    public int getCantitateLegumeSaptamana() {
        return cantitateLegumeSaptamana;
    }

    public void setCantitateLegumeSaptamana(int cantitateLegumeSaptamana) {
        this.cantitateLegumeSaptamana = cantitateLegumeSaptamana;
    }

    public int getCantitateLegumeZi() {
        return cantitateLegumeZi;
    }

    public void setCantitateLegumeZi(int cantitateLegumeZi) {
        this.cantitateLegumeZi = cantitateLegumeZi;
    }

    public int getCantitateRosiiSaptamana() {
        return cantitateRosiiSaptamana;
    }

    public void setCantitateRosiiSaptamana(int cantitateRosiiSaptamana) {
        this.cantitateRosiiSaptamana = cantitateRosiiSaptamana;
    }

    public int getCantitateCartofiSaptamana() {
        return cantitateCartofiSaptamana;
    }

    public void setCantitateCartofiSaptamana(int cantitateCartofiSaptamana) {
        this.cantitateCartofiSaptamana = cantitateCartofiSaptamana;
    }

    public int getCantitateFructeSaptamana() {
        return cantitateFructeSaptamana;
    }

    public void setCantitateFructeSaptamana(int cantitateFructeSaptamana) {
        this.cantitateFructeSaptamana = cantitateFructeSaptamana;
    }

    public String getFructeMicDejun() {
        return fructeMicDejun;
    }

    public void setFructeMicDejun(String fructeMicDejun) {
        this.fructeMicDejun = fructeMicDejun;
    }

    public int getCantitateCarneSaptamana() {
        return cantitateCarneSaptamana;
    }

    public void setCantitateCarneSaptamana(int cantitateCarneSaptamana) {
        this.cantitateCarneSaptamana = cantitateCarneSaptamana;
    }

    public int getCantitateOua() {
        return cantitateOua;
    }

    public void setCantitateOua(int cantitateOua) {
        this.cantitateOua = cantitateOua;
    }

    public String getSare() {
        return sare;
    }

    public void setSare(String sare) {
        this.sare = sare;
    }

    public int getCantitateSare() {
        return cantitateSare;
    }

    public void setCantitateSare(int cantitateSare) {
        this.cantitateSare = cantitateSare;
    }

    public int getCantitatePaine() {
        return cantitatePaine;
    }

    public void setCantitatePaine(int cantitatePaine) {
        this.cantitatePaine = cantitatePaine;
    }

    public String getLocalizare() {
        return localizare;
    }

    public void setLocalizare(String localizare) {
        this.localizare = localizare;
    }

    public double calculatorIMC(int greutate, int inaltime){
        double inaltimeConvertita = (double)inaltime/100;
        double IMC = greutate/(inaltimeConvertita*inaltimeConvertita);
        return IMC;
    }
    public String calculareIMC(double IMC){

        String interpretare = "";

        if (IMC < 18.5) {
            interpretare = "Subponderal";
        } else if (IMC >= 18.5 && IMC < 24.9) {
            interpretare = " Greutate normala";
        } else if (IMC >= 25 && IMC < 29.9) {
            interpretare = "Supraponderal";
        } else {
            interpretare= "Obezitate";
        }

        return interpretare;
    }
    public String interpretareCitrice(String consumSucuriNaturale, int cantitateSucuriNaturale){
        String interpretareCitrice="";
        if(consumSucuriNaturale == "Nu" || cantitateSucuriNaturale == 0 || cantitateSucuriNaturale == 100){
            interpretareCitrice = " Consumul de citrice a fost enumerat in mai multe studii ca fiind un factor protector pentru litiaza renala, recomandam inceperea consumului zilnic intre 120-150 ml.";
        }else{
            interpretareCitrice=" Excelent, sucurile naturale de citrice sunt considerate protectoare impotriva litiazei renale.";
        }

        return interpretareCitrice;
    }
    public String interpretareLapte(int cantitateLapte){
        String interpretareLapte="";
        if(cantitateLapte < 400){
            interpretareLapte = " Consumul de lapte poate ajuta la prevenirea anumitor tipuri de pietre la rinichi, în special calculii de oxalat de calciu, care sunt cel mai frecvent tip.";
        } else{
            interpretareLapte = " Excelent, consumul de lapte ajuta la prevenirea formarii de calculi renali deoarece se leaga cu oxalatul in intestine, impiedicand oxalatul sa fie absorbit in fluxul sanguin si ulterior excretat in urina.";
        }
        return interpretareLapte;
    }
    public String interpretareNrMese(int cantitateMese){
        String interpretareNrMese ="";
        switch(cantitateMese){
            case 1: interpretareNrMese= " Numarul de mese zilnice este prea mic, recomandat este sa aveti 3 mese/zi.";
            break;
            case 2 : interpretareNrMese= " Numarul de mese zilnice este prea mic, recomandat este sa aveti 3 mese/zi.";
            break;
            case 3: interpretareNrMese= " Excelent, numarul de mese este corespunzator.";
            break;
            case 4: interpretareNrMese= " Numarul recomandat de meste pe zi este de 3 mese principale.";
            break;
        }
        return interpretareNrMese;
    }
    public String interpretareCantitateLegumeSaptamana(int cantitateLegumeSaptamana){
        String interpretareCantitateLegumeSaptamana ="";
        switch(cantitateLegumeSaptamana){
            case 1: interpretareCantitateLegumeSaptamana= " Excelent, consumul de legume este un factor protector pentru litiaza.";
                break;
            case 2 : interpretareCantitateLegumeSaptamana= " Excelent, consumul de legume este un factor protector pentru litiaza.";
                break;
            case 3: interpretareCantitateLegumeSaptamana= " Consumul de legume este prea redus este recomandat sa cresteti aportul.";
                break;
            case 4: interpretareCantitateLegumeSaptamana= " Consumul de legume este prea redus este recomandat sa cresteti aportul.";
                break;
        }
        return interpretareCantitateLegumeSaptamana;
    }
    public String interpretareCantitateLegumeZi(int cantitateLegumeZi){
        String interpretareCantitateLegumeZi ="";
        switch(cantitateLegumeZi){
            case 1: interpretareCantitateLegumeZi= " Consumul de legume este prea redus, este recomandat in jur de 2 portii pe zi.";
                break;
            case 2 : interpretareCantitateLegumeZi= " Excelent, consumul de legume este un factor protector pentru litiaza.";
                break;
            case 3: interpretareCantitateLegumeZi= " Excelent, consumul minim recomandat este de 2 portii pe zi.";
                break;
        }
        return interpretareCantitateLegumeZi;
    }
    public String interpretareCantitateFructeSaptamana(int cantitateFructeSaptamana){
        String interpretareCantitateFructeSaptamana ="";
        switch(cantitateLegumeZi){
            case 1: interpretareCantitateFructeSaptamana= " Excelent, este recomandat sa consumati in jur de 3 portii de fructe pe zi.";
                break;
            case 2 : interpretareCantitateFructeSaptamana= " Este recomandat sa consumati fructe zilnic.";
                break;
            case 3: interpretareCantitateFructeSaptamana= " Atentie consumul dumneavoastra de fructe este prea redus, este recomandat sa consumati in jur de 3 portii de fructe pe zi.";
                break;
            case 4: interpretareCantitateFructeSaptamana= " Atentie consumul dumneavoastra de fructe este prea redus, este recomandat sa consumati in jur de 3 portii de fructe pe zi .";
                break;
        }
        return interpretareCantitateFructeSaptamana;
    }
    public String interpretareCantitateCarneSaptamana(int cantitateCarneSaptamana){
        String interpretareCantitateCarneSaptamana ="";
        switch(cantitateCarneSaptamana){
            case 1: interpretareCantitateCarneSaptamana= " Atentie, trebuie sa limitati aportul de proteine animale. Proteinele animale pot crește nivelul de acid uric și pot reduce citratul urinar, care poate favoriza formarea de pietre.";
                break;
            case 2 : interpretareCantitateCarneSaptamana= " Urmăriți un consum moderat de proteine animale. Pentru majoritatea oamenilor, aceasta înseamnă menținerea aportului de carne și ouă la un nivel rezonabil, de obicei în jur de 3-6 uncii de carne pe zi și 1-2 ouă pe zi.";
                break;
            case 3: interpretareCantitateCarneSaptamana= "";
                break;
            case 4: interpretareCantitateCarneSaptamana= "";
                break;
        }
        return interpretareCantitateCarneSaptamana;
    }
    public String interpretareCantitateOuaSaptamana(int cantitateOua){
        String interpretareCantitateOuaSaptamana ="";
        switch(cantitateCarneSaptamana){
            case 1: interpretareCantitateOuaSaptamana= " Excelent, este recomandat sa consumati in jur de 1-2 oua maxim pe zi.";
                break;
            case 2 : interpretareCantitateOuaSaptamana= " Este recomandat sa consumati 1-2 oua maxim pe zi.";
                break;
            case 3: interpretareCantitateOuaSaptamana= " Atentie consumul dumneavoastra de oua este prea mare.Este recomandat sa consumati 1-2 oua maxim pe zi.";
                break;
        }
        return interpretareCantitateOuaSaptamana;
    }
    public String interpretareCantitateSare(int cantitateSare){
        String interpretareCantitateSare ="";
        switch(cantitateSare){
            case 1: interpretareCantitateSare= " Consumul de sare este recomandat sa fie în mod ideal, la 1.500 de miligrame pe zi pentru persoanele cu risc mai mare de pietre la rinichi sau alte probleme de sănătate. Efect asupra pietrelor la rinichi: aportul ridicat de sodiu poate crește cantitatea de calciu din urină, ceea ce poate duce la formarea de pietre la rinichi de oxalat de calciu.";
            break;
            case 2 : interpretareCantitateSare= " Consumul de sare este recomandat sa fie în mod ideal, la 1.500 de miligrame pe zi pentru persoanele cu risc mai mare de pietre la rinichi sau alte probleme de sănătate. Efect asupra pietrelor la rinichi: aportul ridicat de sodiu poate crește cantitatea de calciu din urină, ceea ce poate duce la formarea de pietre la rinichi de oxalat de calciu.";
                break;
            case 3: interpretareCantitateSare= " Consumul de sare este recomandat sa fie în mod ideal, la 1.500 de miligrame pe zi pentru persoanele cu risc mai mare de pietre la rinichi sau alte probleme de sănătate. Efect asupra pietrelor la rinichi: aportul ridicat de sodiu poate crește cantitatea de calciu din urină, ceea ce poate duce la formarea de pietre la rinichi de oxalat de calciu";
                break;
            case 4: interpretareCantitateSare= " Consumul de sare este recomandat sa fie în mod ideal, la 1.500 de miligrame pe zi pentru persoanele cu risc mai mare de pietre la rinichi sau alte probleme de sănătate. Efect asupra pietrelor la rinichi: aportul ridicat de sodiu poate crește cantitatea de calciu din urină, ceea ce poate duce la formarea de pietre la rinichi de oxalat de calciu";
            break;
        }
        return interpretareCantitateSare;
    }
    public String interpretareCantitatePaine(int cantitatePaine){
        String interpretareCantitatePaine ="";
        switch(cantitatePaine){
            case 1: interpretareCantitatePaine= "";
            case 2 : interpretareCantitatePaine= "";
            case 3: interpretareCantitatePaine= " Pâinea poate fi o sursă ascunsă de sodiu. Verificați etichetele nutriționale și alegeți pâine cu conținut mai scăzut de sodiu. Dieta generală: Pâinea în sine nu provoacă în mod direct pietre la rinichi, dar tipul și cantitatea de pâine consumată ar trebui să fie considerate ca parte a unei diete echilibrate.";
                break;
            case 4: interpretareCantitatePaine= " Pâinea poate fi o sursă ascunsă de sodiu. Verificați etichetele nutriționale și alegeți pâine cu conținut mai scăzut de sodiu. Dieta generală: Pâinea în sine nu provoacă în mod direct pietre la rinichi, dar tipul și cantitatea de pâine consumată ar trebui să fie considerate ca parte a unei diete echilibrate.";
            break;
            case 5: interpretareCantitatePaine=" Atentie! Pâinea poate fi o sursă ascunsă de sodiu. Verificați etichetele nutriționale și alegeți pâine cu conținut mai scăzut de sodiu. Dieta generală: Pâinea în sine nu provoacă în mod direct pietre la rinichi, dar tipul și cantitatea de pâine consumată ar trebui să fie considerate ca parte a unei diete echilibrate.";
            break;
        }
        return interpretareCantitatePaine;
    }
}
