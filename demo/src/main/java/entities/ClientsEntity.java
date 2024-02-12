package entities;

import lombok.Getter;
import lombok.Setter;

public class ClientsEntity {
    private Long id;
    @Setter
    @Getter
    private String nom;
    @Setter
    @Getter
    private String prenom;


    // Constructeur avec paramètres
    public ClientsEntity(Long id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }



}