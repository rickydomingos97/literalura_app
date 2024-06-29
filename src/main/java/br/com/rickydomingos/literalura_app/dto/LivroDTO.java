package br.com.rickydomingos.literalura_app.dto;

import br.com.rickydomingos.literalura_app.model.Idioma;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LivroDTO(
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<AutorDTO> autores,
        @JsonAlias("languages") String[] idiomas
        ) {

        public List<Idioma> getIdiomasAsEnum() {
                return Arrays.stream(idiomas)
                        .map(Idioma::fromString)
                        .collect(Collectors.toList());
        }

}