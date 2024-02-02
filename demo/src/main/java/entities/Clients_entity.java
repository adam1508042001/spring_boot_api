package entities;

public class Clients_entity {

    private String adresse;
    private String nom;
    private Integer code;

    // Constructeur avec paramètres
    public Clients_entity(String adresse, String nom, Integer code) {
        this.adresse = adresse;
        this.nom = nom;
        this.code = code;
    }

    // Méthodes get (accesseurs)
    public String getAdresse() {
        return adresse;
    }

    public String getNom() {
        return nom;
    }

    public Integer getCode() {
        return code;
    }
}
