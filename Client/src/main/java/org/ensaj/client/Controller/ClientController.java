package org.ensaj.client.Controller;

import org.ensaj.client.Model.Client;
import org.ensaj.client.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients")
    public List<Client> chercherClients(){
        return clientRepository.findAll();
    }

    @GetMapping("/client/{Id}")
    public Client chercherUnClient(@PathVariable Long Id) throws Exception {
        return clientRepository.findById(Id).orElseThrow(()-> new Exception("Client inexistant"));
    }
}
