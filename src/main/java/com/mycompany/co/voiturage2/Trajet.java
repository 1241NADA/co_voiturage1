/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.co.voiturage2;


import java.time.LocalDate;
import java.time.LocalTime;

public class Trajet {
    private String pointDepart;
    private String destination;
    private LocalDate date;
    private LocalTime heure;
    private int placesDisponibles;
    private double coutParPassager;
    private double distance; // Distance est maintenant dans la classe Trajet

    // Constructeur
    public Trajet(String pointDepart, String destination, LocalDate date, LocalTime heure, int placesDisponibles, double coutParPassager, double distance) {
        this.pointDepart = pointDepart;
        this.destination = destination;
        this.date = date;
        this.heure = heure;
        this.placesDisponibles = placesDisponibles;
        this.coutParPassager = coutParPassager;
        this.distance = distance;
    }

    // Méthode pour mettre à jour le trajet
    public void mettreAJourTrajet(String nouvelleDestination, LocalDate nouvelleDate) {
        this.destination = nouvelleDestination;
        this.date = nouvelleDate;
    }

    // Méthode pour calculer le coût total du trajet
    public double calculerCoutTotal() {
        return placesDisponibles * coutParPassager;
    }

    // Getters et setters
    public String getPointDepart() {
        return pointDepart;
    }

    public void setPointDepart(String pointDepart) {
        this.pointDepart = pointDepart;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeure() {
        return heure;
    }

    public void setHeure(LocalTime heure) {
        this.heure = heure;
    }

    public int getPlacesDisponibles() {
        return placesDisponibles;
    }

    public void setPlacesDisponibles(int placesDisponibles) {
        this.placesDisponibles = placesDisponibles;
    }

    public double getCoutParPassager() {
        return coutParPassager;
    }

    public void setCoutParPassager(double coutParPassager) {
        this.coutParPassager = coutParPassager;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}


