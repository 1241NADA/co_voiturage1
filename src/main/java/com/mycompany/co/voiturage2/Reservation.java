/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.co.voiturage2;

import java.time.LocalDate;

public class Reservation {
    private Trajet trajet; // L'objet Trajet associé à la réservation
    private LocalDate dateReservation; // La date de la réservation
    private String statut; // Le statut de la réservation (confirmée, annulée, etc.)

    // Constructeur
    public Reservation(Trajet trajet, LocalDate dateReservation, String statut) {
        this.trajet = trajet;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }

    // Méthode pour confirmer la réservation
    public void confirmerReservation() {
        if (!"confirmée".equals(statut)) {
            this.statut = "confirmée";
            System.out.println("Réservation confirmée.");
        } else {
            System.out.println("Réservation déjà confirmée.");
        }
    }

    // Méthode pour annuler la réservation
    public void annulerReservation() {
        if (!"annulée".equals(statut)) {
            this.statut = "annulée";
            System.out.println("Réservation annulée.");
        } else {
            System.out.println("Réservation déjà annulée.");
        }
    }

    // Getters et setters
    public Trajet getTrajet() {
        return trajet;
    }

    public void setTrajet(Trajet trajet) {
        this.trajet = trajet;
    }

    public LocalDate getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDate dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}

