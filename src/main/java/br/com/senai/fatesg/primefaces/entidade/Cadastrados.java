package br.com.senai.fatesg.primefaces.entidade;

import javax.persistence.*;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;


@Entity
public class Cadastrados {

    @Id
    @GeneratedValue(generator = "cadastrados_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "cadastrados_seq", sequenceName = "cadastrados_seq", allocationSize = 1, initialValue = 1)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String cpf;

    private String email;
    private String nome;
    private String celular;
    private String tipo;

    //getters setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTipo() {return tipo;}

    public void setTipo(String tipo) {this.tipo = tipo;}
}