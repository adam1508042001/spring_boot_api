package com.example.demo.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "clients")
public class ClientsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Setter
    @Getter
    private String nom;

    @Setter
    @Getter
    private String prenom;

    //CONSTRUCTEUR
    public ClientsEntity() {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }


}