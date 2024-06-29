package br.com.rickydomingos.literalura_app.model;

import br.com.rickydomingos.literalura_app.dto.LivroDTO;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Response (
        @JsonAlias("results") List<LivroDTO> livros
){

}