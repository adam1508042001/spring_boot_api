package service;

import entities.ClientsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClientsRepository;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientsRepository clientsRepository;

   /* public void saveClient(ClientsEntity clientsEntity) {
        clientsRepository.save(clientsEntity);
    }*/

    public Optional<ClientsEntity> findClientById(Long id) {
        return clientsRepository.findById(id);
    }

    /*public void updateClient(ClientsEntity clientsEntity) {
        clientsRepository.update(clientsEntity);
    }*/


/*    //supprimer un client de la base de données en utilisant le repository ClientsRepository
    public void deleteClient(Long id) {
        ClientsEntity clientsEntity = clientsRepository.findById(id);
        if (clientsEntity != null) {
            clientsRepository.delete(clientsEntity);
        } else {
            throw new RuntimeException("Client not found with id: " + id);
        }
    }*/
}
