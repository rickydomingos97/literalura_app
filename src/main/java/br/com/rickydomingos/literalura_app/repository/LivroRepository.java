package br.com.rickydomingos.literalura_app.repository;

import br.com.rickydomingos.literalura_app.model.Idioma;
import br.com.rickydomingos.literalura_app.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    Optional<Livro> findByTitulo(String nomeLivro);
    List<Livro> findByIdiomaEnum(Idioma idiomaEnum);
}