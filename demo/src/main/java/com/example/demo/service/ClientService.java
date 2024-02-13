package com.example.demo.service;

import com.example.demo.entities.ClientsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ClientsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements IClientService {

    @Autowired
    private ClientsRepository clientsRepository;



   /* public void saveClient(ClientsEntity clientsEntity) {
        clientsRepository.save(clientsEntity);
    }*/


    public Optional<ClientsEntity> findClientById(Long id) {
        return clientsRepository.findById(id);
    }
    public List<ClientsEntity> getAllClients() {
        return clientsRepository.findAll();
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
