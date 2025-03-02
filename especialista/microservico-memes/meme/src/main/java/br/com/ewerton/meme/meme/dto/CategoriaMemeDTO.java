package br.com.ewerton.meme.meme.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class CategoriaMemeDTO {
    private Long id;
    private String nome;
    private String descricao;
    private Date dataCadastro;
}
