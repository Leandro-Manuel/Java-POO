package br.com.alura.screenmatch.exercicios.atividade9;

public class Livro extends Item implements Calculavel{
    private String genero;


    @Override
    public double calcularPrecoFinal() {
        if (getPreco() > 50) {
            return (getPreco() - getDesconto());
        } else {
            return getPreco();
        }
    }

    @Override
    public void mostrarInformacao() {
        System.out.printf("Preço original: %.2f / Preço final com desconto: %.2f",getPreco(), calcularPrecoFinal());
    }
}
