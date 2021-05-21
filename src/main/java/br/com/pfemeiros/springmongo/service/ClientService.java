package br.com.pfemeiros.springmongo.service;

import br.com.pfemeiros.springmongo.model.Client;
import br.com.pfemeiros.springmongo.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Client getById(String id) {
        return clientRepository.findById(id).orElse(null);
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }

    public Client update(Client client) {
        return clientRepository.save(client);
    }

    public void delete(String id) {
        clientRepository.deleteById(id);
    }
}
