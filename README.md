Création d'une API Spring Boot en utilisant Java et établissement d'une connexion avec une base de données pour effectuer des modifications sur son contenu et gérer les données à l'aide des routes qui peuvent être testées directement depuis la documentation de l'API (Swagger) ou avec Postman.



Spring Boot est un framework Java qui permet de créer cette API tout en offrant des configurations automatiques basées sur des conventions. Dans ce framework, il est possible d'ajouter des dépendances via Maven, dans mon cas, simplifiant ainsi l'ajout des bibliothèques nécessaires au développement de l'API. Avec Spring Boot, l'utilisation de Spring Boot JPA facilite l'accès aux bases de données relationnelles.



on peut déclarer des methodes abstraites dans des classes abstraites et les appeler à l'aide de l'heritage dans la classe derivée communément appelée fille, ces methodes abstraites ne peuvent rien faire au niveau de la classe parente mais qui peuvent avoir un impact dans la classe dérivée avec bien sur l'utilisation de l'annotation @override.


public abstract class Personne {
    public void marcher() {
        System.out.println("Je marche.");
    }

    // Méthode abstraite
    public abstract void parler();
}

on peut l'appeler dans la classe fille avec @override
public class Etudiant extends Personne {
    @Override
    public void parler() {
        System.out.println("Je parle en tant qu'étudiant.");
    }
}


En Java, == permet de comparer les références mais
pas les objets (exemple si la valeur est contenue dans la meme variable v1 == v1)
.equals Pour déterminer si 2 objets sont les mêmes (attributs
de mêmes valeurs) 
exemple (
v1 ="afroune"
v3="afroune"
v1.equals(v3) ?? 
la reponse est oui v1 equals v3.
)
