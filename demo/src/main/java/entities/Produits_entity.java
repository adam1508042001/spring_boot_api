package entities;

//creation de la classe
public class Produits_entity {
    private String reference;
    private String designation;
    private Integer prix_semaine;


    //creation d'un constructeur
    public Produits_entity(String reference, String designation, Integer prix_semaine) {
        this.reference = reference;
        this.designation = designation;
        this.prix_semaine = prix_semaine;

    }


    public String getreference() {
        return reference;
    }

    public  String getDesignation() {

        return designation;
    }

    public Integer getPrix_semaine() {
        return prix_semaine;
    }




}


