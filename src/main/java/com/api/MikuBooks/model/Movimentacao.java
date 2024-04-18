package com.api.MikuBooks.model;

import java.time.LocalDate;

import com.api.MikuBooks.validation.TipoMovimentacao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;


@Data
@Entity
public class Movimentacao {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @PastOrPresent
    private LocalDate data;
    
    @TipoMovimentacao(message = "{movimentacao.tipo.tipomovimentacao}")
    private String tipo; // ENTRADA | SAIDA
}
