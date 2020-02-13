package com.pontoback.model;

import org.hibernate.annotations.Where;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "livro")
@Where(clause = "is_active = true")
public class Livro {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String isbn = UUID.randomUUID().toString();
    private String title;
    private String subject;
    private LocalDate createdAt = LocalDate.now();

    @ManyToOne
    private Autor autor;

    @Column(name = "is_active")
    private boolean active = true;

    public Livro() {
        /** Construtor Vazio */
    }

    public Livro(String isbn, String title, String subject, LocalDate createdAt, Autor autor, boolean active) {
        this.isbn = isbn;
        this.title = title;
        this.subject = subject;
        this.createdAt = createdAt;
        this.autor = autor;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
