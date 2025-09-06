package br.com.alura.screenmatch.exercicios.AtividadeJson;
import br.com.alura.screenmatch.exercicios.atividadeJson2.LivroR;

public class Livro {
    private String titulo;
    private String autor;
    private Object editora;

    public Livro(LivroR livro) {
        this.titulo = livro.titulo();
        this.autor = livro.autor();
        this.editora = livro.editora();
    }

    @Override
    public String toString() {
        return "Nome: " + this.titulo + "\n" + "Autor: " + this.autor + "\n" + "Editora: " + editora;
    }
}
