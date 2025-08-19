package br.com.alura.screenmatch.exercicios.atividade9;

import br.com.alura.screenmatch.exercicios.atividade4.Produto;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setNome("Legends");
        livro.setPreco(100);
        livro.calcularPrecoFinal();
        livro.mostrarInformacao();

        ProdutoFisico ventilador = new ProdutoFisico();
        ventilador.setNome("Multilacer ventilador");
        ventilador.setPreco(299);
        ventilador.calcularPrecoFinal();
        ventilador.mostrarInformacao();
    }
}
