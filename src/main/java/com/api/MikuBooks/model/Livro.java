package com.api.MikuBooks.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
@Entity
public class Livro{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "{livro.livro.notblank}")
    private String nome;

    private String autor;

    private String editora;

    private String paginas;

    private String review;
}