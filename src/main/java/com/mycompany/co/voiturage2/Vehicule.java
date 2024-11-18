/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.co.voiturage2;

public class Vehicule {
    private String marque;          // Marque du véhicule (ex: Toyota, BMW)
    private String modele;          // Modèle du véhicule (ex: Corolla, X5)
    private String type;            // Type de véhicule (ex: voiture ou fourgonnette)
    private int annee;              // Année de fabrication
    private String immatriculation; // Numéro d'immatriculation du véhicule

    // Constructeur
    public Vehicule(String marque, String modele, String type, int annee, String immatriculation) {
        this.marque = marque;
        this.modele = modele;
        this.type = type;
        this.annee = annee;
        this.immatriculation = immatriculation;
    }

    // Méthode pour afficher les détails du véhicule
    public void afficherDetailsVehicule() {
        System.out.println("Détails du véhicule :");
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);
        System.out.println("Type : " + type);
        System.out.println("Année : " + annee);
        System.out.println("Immatriculation : " + immatriculation);
    }

    // Getters et setters
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }
}

