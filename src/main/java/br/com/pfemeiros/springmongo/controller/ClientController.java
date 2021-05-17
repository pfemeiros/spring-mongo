package br.com.pfemeiros.springmongo.controller;

import br.com.pfemeiros.springmongo.model.Client;
import br.com.pfemeiros.springmongo.service.ClientService;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getAll() {
        return clientService.getClients();
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable String id) {
        return clientService.getById(id);
    }

}
