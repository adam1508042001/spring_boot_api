Création d'une API Spring Boot en utilisant Java et établissement d'une connexion avec une base de données pour son administration à l'aide des routes qui peuvent être testées directement depuis la documentation de l'API (Swagger) ou avec Postman.

Spring Boot est un framework Java qui permet de créer cette API tout en offrant des configurations automatiques basées sur des conventions. Dans ce framework, il est possible d'ajouter des dépendances via Maven, simplifiant ainsi l'ajout des bibliothèques nécessaires au développement de l'API. Avec Spring Boot, l'utilisation de Spring Boot JPA facilite l'accès aux bases de données relationnelles.

On peut déclarer des méthodes abstraites dans des classes abstraites et les appeler à l'aide de l'héritage dans la classe dérivée, communément appelée fille. Ces méthodes abstraites ne peuvent rien faire au niveau de la classe parente, mais elles peuvent avoir un impact dans la classe dérivée avec l'utilisation de l'annotation @Override.

java
Copy code
public abstract class Personne {
    public void marcher() {
        System.out.println("Je marche.");
    }

    // Méthode abstraite
    public abstract void parler();
}
On peut les appeler dans la classe fille avec @Override :

java
Copy code
public class Etudiant extends Personne {
    @Override
    public void parler() {
        System.out.println("Je parle en tant qu'étudiant.");
    }
}
En Java, == permet de comparer les références, mais pas les objets (par exemple, si la valeur est contenue dans la même variable v1 == v1). .equals() permet de déterminer si deux objets ont les mêmes valeurs (attributs de mêmes valeurs). Par exemple, si v1 est "afroune" et v3 est aussi "afroune", alors v1.equals(v3) serait vrai.
