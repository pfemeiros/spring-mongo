package br.com.pfemeiros.springmongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "client")
public class Client {
    @Id
    private String id;
    private String name;
    private LocalDate birthDate;
    private String email;
    private String phoneNumber;
}
