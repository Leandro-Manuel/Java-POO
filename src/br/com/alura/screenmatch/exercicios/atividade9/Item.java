package br.com.alura.screenmatch.exercicios.atividade9;

public abstract class Item {
    private String nome;
    private double preco;

    public double getDesconto() {
        return preco * 0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract void mostrarInformacao();
}
