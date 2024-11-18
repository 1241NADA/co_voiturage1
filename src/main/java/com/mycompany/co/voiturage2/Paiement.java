/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.co.voiturage2;

public class Paiement {
    private double montant;            // Montant du paiement
    private String modePaiement;       // Mode de paiement (ex: carte de crédit, espèces)
    private Reservation reservation;    // Référence à la réservation associée

    // Constructeur
    public Paiement(double montant, String modePaiement, Reservation reservation) {
        this.montant = montant;
        this.modePaiement = modePaiement;
        this.reservation = reservation;
    }

    // Méthode pour effectuer le paiement
    public void effectuerPaiement() {
        // Logique pour effectuer le paiement (par exemple, mise à jour du statut de réservation)
        System.out.println("Paiement de " + montant + " effectué par " + modePaiement + " pour la réservation : " + reservation);
        // Vous pourriez ajouter du code pour actualiser le statut de la réservation ici
    }

    // Méthode pour annuler le paiement
    public void annulerPaiement() {
        // Logique pour annuler le paiement (par exemple, mettre à jour le statut de réservation)
        System.out.println("Paiement de " + montant + " annulé pour la réservation : " + reservation);
        // Vous pourriez ajouter du code pour annuler le statut de la réservation ici
    }

    // Getters et setters
    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}

