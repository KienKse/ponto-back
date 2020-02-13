package com.pontoback.model;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String nome;
    private String email;

    @OneToMany(mappedBy = "author", fetch = FetchType.EAGER)
    private List<Livro> livros;

    public Autor() {
        /** Construtor Vazio */
    }

    public Autor(String nome, String email, List<Livro> livros) {
        this.nome = nome;
        this.email = email;
        this.livros = livros;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}
