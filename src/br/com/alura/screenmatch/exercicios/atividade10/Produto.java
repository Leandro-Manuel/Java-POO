package br.com.alura.screenmatch.exercicios.atividade10;

public class Produto implements Vendavel{
    private String nome;
    private double valor;
    private int quantidade;

    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    @Override
    public void calcularPrecoTotal() {
        System.out.println("\n--------------------");
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Preço total a ser pago: R$ " + this.valor * this.quantidade);
        System.out.println("--------------------\n");
    }
}
