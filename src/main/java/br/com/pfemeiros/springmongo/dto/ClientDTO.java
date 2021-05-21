package br.com.pfemeiros.springmongo.dto;

import br.com.pfemeiros.springmongo.model.Client;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ClientDTO {

    private String name;
    private LocalDate birthDate;
    private String email;
    private String phoneNumber;

    public ClientDTO(Client client) {
        this.name = client.getName();
        this.birthDate = client.getBirthDate();
        this.email = client.getEmail();
        this.phoneNumber = client.getPhoneNumber();
    }

}
