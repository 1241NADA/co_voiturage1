/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.co.voiturage2;

import java.time.LocalDate;
import java.time.LocalTime;

public class TrajetCourt extends Trajet {
    private int duree; // Durée du trajet court (en minutes)

    // Constructeur qui appelle le constructeur parent (Trajet) et initialise l'attribut spécifique
    public TrajetCourt(String pointDepart, String destination, LocalDate date, LocalTime heure, int placesDisponibles, double coutParPassager, double distance, int duree) {
        super(pointDepart, destination, date, heure, placesDisponibles, coutParPassager, distance); // Appel du constructeur parent
        this.duree = duree;
    }

    // Méthode spécifique pour ajuster le coût en fonction de la durée (par exemple, si la durée est très courte)
    public void ajusterCout() {
        if (duree < 30) { // Si le trajet dure moins de 30 minutes, on réduit le coût
            double nouveauCout = getCoutParPassager() * 0.9; // Réduction de 10%
            setCoutParPassager(nouveauCout);
        }
    }

    // Getters et setters pour la durée
    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
}
