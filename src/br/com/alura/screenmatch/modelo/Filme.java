package br.com.alura.screenmatch.modelo;

public class Filme {
    public String nome;
    public String autor;
    public int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacao;


    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Autor: " + autor);
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
