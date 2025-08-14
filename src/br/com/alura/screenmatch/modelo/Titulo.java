package br.com.alura.screenmatch.modelo;

public class Titulo {
    private String nome;
    private String autor;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacao;

    private int duracaoMinutos;


    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Autor: " + autor);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void avaliar(double avaliacao) {
        if(avaliacao >= 0 && avaliacao <= 10) {
            somaDasAvaliacoes += avaliacao;
            totalAvaliacao++;
        } else System.out.println("Valor inválido, tente novamente.");
    }

    public double pegarMedia() {
        return somaDasAvaliacoes / totalAvaliacao;
    }
}
