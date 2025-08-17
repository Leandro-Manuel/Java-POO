package br.com.alura.screenmatch.exercicios.atividade1;

import br.com.alura.screenmatch.exercicios.atividade1.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setModelo("Civic 1.8 turbo");
        carro.setPrecoDoCarro(21.999,19.599,27.599);
        carro.calcularMaiorPreco();
        carro.calcularMenorPreco();
        carro.mostrarInfo();

    }
}
