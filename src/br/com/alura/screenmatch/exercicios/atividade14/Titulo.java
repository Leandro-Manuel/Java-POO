package br.com.alura.screenmatch.exercicios.atividade14;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

    public String getNome() {
        return this.nome;
    }
}
