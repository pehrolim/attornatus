package br.com.pehrolim.attornatus.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logradouro;

    private String CEP;

    private int numero;

    private String cidade;

    @ManyToOne
    private Pessoa pessoa;



}
