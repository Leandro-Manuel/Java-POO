package br.com.alura.screenmatch.exercicios.atividade1;

public class Carro {
    private String modelo;
    private double preco1ano;
    private double preco2ano;
    private double preco3ano;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecoDoCarro(double valor1, double valor2, double valor3) {
        this.preco1ano = valor1;
        this.preco2ano = valor2;
        this.preco3ano = valor3;
    }

    public double calcularMaiorPreco() {
        double maior = this.preco1ano;
        if(preco2ano > maior) {
            maior = preco2ano;
        }
        if (preco3ano > maior) {
            maior = preco3ano;
        }
        return maior;
    }

    public double calcularMenorPreco() {
        double menor = this.preco1ano;
        // calcular o menor valor
        if(preco2ano < menor) {
            menor = preco2ano;
        }
        if(preco3ano < menor) {
            menor = preco3ano;
        }
        return menor;
    }
    public void mostrarInfo() {
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Preço do 1 ano: " + preco1ano);
        System.out.println("Preço do 2 ano: " + preco2ano);
        System.out.println("Preço do 3 ano: " + preco3ano);
        System.out.printf("\nMaior preço do carro: R$%.3f",calcularMaiorPreco());
        System.out.printf("\nMenor preço do carro: R$%.3f",calcularMenorPreco());
    }
}
