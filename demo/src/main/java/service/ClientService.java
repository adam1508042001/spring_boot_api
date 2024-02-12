package service;

import entities.ClientsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClientsRepository;

@Service
public class ClientService {

    private ClientsRepository clientsRepository;
//injecter automatiquement le repository ClientsRepository dans la classe de service.
    @Autowired
    public void ClientsService(ClientsRepository clientsRepository) {
        this.clientsRepository = clientsRepository;
    }
// fournit des méthodes pour effectuer des opérations CRUD sur des entités ClientsEntity en utilisant le repository ClientsRepository.
    public ClientService(ClientsRepository clientsRepository) {
        this.clientsRepository = clientsRepository;
    }

    public void saveClient(ClientsEntity clientsEntity) {
        clientsRepository.save(clientsEntity);
    }

    public ClientsEntity findClientById(Long id) {
        return clientsRepository.findById(id);
    }

    public void updateClient(ClientsEntity clientsEntity) {
        clientsRepository.update(clientsEntity);
    }


    //supprimer un client de la base de données en utilisant le repository ClientsRepository
    public void deleteClient(Long id) {
        ClientsEntity clientsEntity = clientsRepository.findById(id);
        if (clientsEntity != null) {
            clientsRepository.delete(clientsEntity);
        } else {
            throw new RuntimeException("Client not found with id: " + id);
        }
    }
}
