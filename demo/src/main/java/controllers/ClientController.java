package controllers;

import entities.ClientsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ClientService;

import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

   /* @PostMapping("/save")
    public void saveClient(@RequestBody ClientsEntity clientsEntity) {
        clientService.saveClient(clientsEntity);
    }*/




    @GetMapping("/{id}")
    public Optional<ClientsEntity> getClientById(@PathVariable Long id) {
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
