/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.co.voiturage2;

import java.time.LocalDate;
import java.time.LocalTime;


public class TrajetLong extends Trajet {
    private double coutSupplementaire; // Coût supplémentaire pour les trajets longs

    // Constructeur qui appelle le constructeur parent (Trajet) et initialise l'attribut spécifique
    public TrajetLong(String pointDepart, String destination, LocalDate date, LocalTime heure, int placesDisponibles, double coutParPassager, double distance, double coutSupplementaire) {
        super(pointDepart, destination, date, heure, placesDisponibles, coutParPassager, distance); // Appel du constructeur parent
        this.coutSupplementaire = coutSupplementaire;
    }

    // Méthode spécifique pour ajuster le coût avec un supplément
    public void ajusterCout() {
        double nouveauCout = getCoutParPassager() + coutSupplementaire;
        setCoutParPassager(nouveauCout);
    }

    // Getters et setters pour le coût supplémentaire
    public double getCoutSupplementaire() {
        return coutSupplementaire;
    }

    public void setCoutSupplementaire(double coutSupplementaire) {
        this.coutSupplementaire = coutSupplementaire;
    }
}
