package br.com.alura.screenmatch.exercicios.atividade13;

public class Animal {
    private String nome;
    private String cor;

    public Animal(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public void fazerBarulho() {
        System.out.println("HHAA!");
    }
}
