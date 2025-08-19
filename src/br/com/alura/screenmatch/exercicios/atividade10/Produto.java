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

    private double valorTotal() {
        return this.valor * this.quantidade;
    }

    public double obterDesconto() {
        if(this.quantidade > 2) {
            return valorTotal() * 0.1;
        } else {
            return 0;
        }
    }

    @Override
    public void calcularPrecoTotal() {
        System.out.println("\n--------------------");
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.printf("Preço total a ser pago: R$ %.2f", (this.valor * this.quantidade) - obterDesconto());
        System.out.println("\n--------------------");
    }
}
