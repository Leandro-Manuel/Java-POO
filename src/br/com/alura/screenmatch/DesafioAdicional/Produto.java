package br.com.alura.screenmatch.DesafioAdicional;
public class Produto implements Comparable<Produto>{
    private String nome;
    private double valor;
    public Produto(String nome, double valor) {
        if (valor > 0) {
            this.nome = nome;
            this.valor = valor;
        } else {
            System.out.println("Valores inválidos, tente novamente.");
        }
    }
    public double getValor() {
        return this.valor;
    }
    public String getNome() {
        return this.nome;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return 0;
    }
}
