/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.co.voiturage2;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;
import java.time.LocalTime;

public class GestionTrajet {
    private List<Trajet> trajetDisponible; // Liste des trajets disponibles

    // Constructeur
    public GestionTrajet() {
        this.trajetDisponible = new ArrayList<>(); // Initialisation de la liste
    }

    // Méthode pour ajouter un trajet à la liste des trajets disponibles
    public void ajouterTrajet(Trajet trajet) {
        trajetDisponible.add(trajet);
        System.out.println("Trajet ajouté : " + trajet);
    }

    // Méthode pour rechercher des trajets en fonction de la destination et de la date
    public List<Trajet> rechercherTrajet(String destination, LocalDate date) {
        List<Trajet> trajetsTrouves = new ArrayList<>(); // Liste pour stocker les trajets trouvés

        // Parcourir la liste des trajets disponibles
        for (Trajet trajet : trajetDisponible) {
            // Vérifier si le trajet correspond à la destination et à la date
            if (trajet.getDestination().equalsIgnoreCase(destination) && trajet.getDate().isEqual(date)) {
                trajetsTrouves.add(trajet);
            }
        }
        
        return trajetsTrouves; // Retourner la liste des trajets trouvés
    }

    // Getter pour la liste des trajets disponibles
    public List<Trajet> getTrajetDisponible() {
        return trajetDisponible;
    }
}

