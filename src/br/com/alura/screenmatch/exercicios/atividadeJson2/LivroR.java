package br.com.alura.screenmatch.exercicios.atividadeJson2;

public record LivroR(String titulo, String autor, Editora editora) {
    @Override
    public String toString() {
        return "Nome: " + this.titulo + "\n" + "Autor: " + this.autor;
    }
}
