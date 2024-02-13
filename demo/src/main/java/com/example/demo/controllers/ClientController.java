package com.example.demo.controllers;

import com.example.demo.entities.ClientsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.ClientService;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;


   /* @PostMapping("/save")
    public void saveClient(@RequestBody ClientsEntity clientsEntity) {
        clientService.saveClient(clientsEntity);
    }*/


    @GetMapping("/clients")
    public @ResponseBody List<ClientsEntity> getAllClients() {
        return clientService.getAllClients();
    }


    @GetMapping(value = "/id")
    public @ResponseBody Optional<ClientsEntity> getClientById(@PathVariable Long id) {
        return clientService.findClientById(id);
    }




  /*  @PutMapping("/update")
    public void updateClient(@RequestBody ClientsEntity clientsEntity) {
        clientService.updateClient(clientsEntity);
    }*/

   /* @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }*/
}
