package entities;

//creation de la classe
public class Produits_entity {
    private String reference;
    private String designation;
    private Integer prix_loc_semaine;


    //creation d'un constructeur
    public Produits_entity(String reference, String designation, Integer prix_loc_semaine) {
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


