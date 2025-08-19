package br.com.alura.screenmatch.exercicios.atividade10;

public class Principal {
    public static void main(String[] args) {
        Produto shampoo = new Produto("Nivea anti-caspa",24.99,4);
        shampoo.calcularPrecoTotal();

        Servico corte = new Servico("Corte de cabelo",35,2);
        corte.calcularPrecoTotal();
    }
}
