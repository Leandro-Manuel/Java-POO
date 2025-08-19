package br.com.alura.screenmatch.exercicios.atividade4;

public class Servico implements Tributavel {
    private String nome;
    private double valor;

    public Servico(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public double calcularImposto() {
        return valor * 0.05;
    }
}
