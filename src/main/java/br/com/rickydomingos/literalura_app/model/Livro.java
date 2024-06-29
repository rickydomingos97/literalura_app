package br.com.rickydomingos.literalura_app.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, length = 1000)
    private String titulo;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinTable(
            name = "livro_autor",
            joinColumns = @JoinColumn(name = "livro_id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id")
    )
    private List<Autor> autor = new ArrayList<>();

    public Livro(String titulo, List<Autor> autor, Idioma idiomaEnum) {
        this.titulo = titulo;
        this.autor = autor;
        this.idiomaEnum = idiomaEnum;
    }

    @Enumerated(EnumType.STRING)
    private Idioma idiomaEnum;

    public Livro() {
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutorList() {
        return autor;
    }

    public void setAutorList(List<Autor> autor) {
        this.autor = autor;
    }

    public Idioma getIdiomaEnum() {
        return idiomaEnum;
    }

    public void setIdiomaEnum(Idioma idiomaEnum) {
        this.idiomaEnum = idiomaEnum;
    }

    @Override
    public String toString() {
        return
                " Livro: '" + titulo + '\'' +
                ", Autor(es): " + (autor != null ? autor.toString() : "Nenhum") +
                ", Idioma: " + (idiomaEnum != null ? idiomaEnum.toString() : "Desconhecido");
    }
}