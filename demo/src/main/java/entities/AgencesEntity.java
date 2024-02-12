package entities;

public class AgencesEntity {
    private String adresse;
    private String nom_agence;
    private Integer numero;


    public AgencesEntity(String adresse, String nom_agence, Integer numero) {
        this.adresse = adresse;
        this.nom_agence = nom_agence;
        this.numero = numero;

    }


    public String getAdresse() {
        return adresse;
    }

    public String getNomAgence() {
        return nom_agence;
    }

    public Integer getNumero() {
        return numero;
    }






}
