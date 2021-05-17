package br.com.pfemeiros.springmongo.repository;

import br.com.pfemeiros.springmongo.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String> {
}
