package entities;

public class adresse_entity {
    private  String nom_ville;
    private String nom_rue;
    private  Integer numero;
    private Integer code_postal;




    public adresse_entity(String nom_ville,String nom_rue,Integer numero,Integer code_postal){
        this.nom_ville= nom_ville;
        this.nom_rue= nom_rue;
        this.code_postal= code_postal;
        this.numero= numero;
    }

    public String getNom_ville() {
        return nom_ville;
    }
    public String getNom_rue() {return  nom_rue;}
    public Integer getNumero() {return numero;}
    public Integer getCode_postal() {return code_postal;}


}

