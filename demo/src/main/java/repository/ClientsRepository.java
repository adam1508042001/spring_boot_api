package repository;


import entities.ClientsEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ClientsRepository {


    @PersistenceContext //injecter automatiquement un entitymanager dans la classe
    private EntityManager entityManager;

//des opérations pour  des méthodes pour effectuer les opérations CRUD (Create, Read, Update, Delete) sur des entités
    public void save(ClientsEntity clientsEntity) {
        entityManager.persist(clientsEntity);
    }

    public ClientsEntity findById(Long id) {
        return entityManager.find(ClientsEntity.class, id);
    }

    public void update(ClientsEntity clientsEntity) {
        entityManager.merge(clientsEntity);
    }

    public void delete(ClientsEntity clientsEntity) {
        entityManager.remove(entityManager.contains(clientsEntity) ? clientsEntity : entityManager.merge(clientsEntity));
    }


}
