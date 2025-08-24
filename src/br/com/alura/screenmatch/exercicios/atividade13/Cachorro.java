package br.com.alura.screenmatch.exercicios.atividade13;

public class Cachorro extends Animal{
    private String raca;
    public Cachorro(String nome, String cor, String raca) {
        super(nome, cor);
        this.raca = raca;
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Au Au Au!");
    }
}
