package com.example.roombookingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SalleController {

    @GetMapping("/salles") // Cela mappe l'URL /salles
    public String listSalles() {
        return "salles"; // Renvoie la vue salles.html dans src/main/resources/templates
    }
}
