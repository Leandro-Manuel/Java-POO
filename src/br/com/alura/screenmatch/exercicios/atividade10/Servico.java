package br.com.alura.screenmatch.exercicios.atividade10;

public class Servico implements Vendavel{

    private String nome;
    private double valor;
    private int quantidade;

    public Servico(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    @Override
    public void calcularPrecoTotal() {
        System.out.println("\n------------------");
        System.out.println("Nome do serviço: " + this.nome);
        System.out.println("Quantidade do serviço: " + this.quantidade);
        System.out.println("Preço final dos serviços: R$ \n" + this.valor * this.quantidade);
        System.out.println("------------------\n");
    }
}
