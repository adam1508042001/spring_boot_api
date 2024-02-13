package com.example.demo.entities;

//creation de la classe
public class ProduitsEntity {
    private String reference;
    private String designation;
    private Integer prix_loc_semaine;


    //creation d'un constructeur
    public ProduitsEntity(String reference, String designation, Integer prix_loc_semaine) {
        this.reference = reference;
        this.designation = designation;
        this.prix_loc_semaine = prix_loc_semaine;

    }


    public String getreference() {
        return reference;
    }

    public  String getDesignation() {
        return designation;
    }

    public Integer getPrix_loc_semaine() {
        return prix_loc_semaine;
    }




}


