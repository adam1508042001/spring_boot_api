package entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
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