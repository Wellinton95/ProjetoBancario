package Wellinton95.com.github.ProjetoBancario;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Data
@Builder
@Entity  //Isso aqui define que é uma classe do banco de dados
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

    @Id  //Define qual e a primary kay do banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Define o tipo de gerador
    private Long id;
    @Column(name ="name", nullable = false) //Define o padrão para a coluna
    private String name;
    @Email
    private String email;
    private String password;
    @CPF
    private String cpf;
    private LocalDate birthDay;
    private Character gender;
    private LocalDate whenCreated;
    private LocalDate lastLogin;
}
