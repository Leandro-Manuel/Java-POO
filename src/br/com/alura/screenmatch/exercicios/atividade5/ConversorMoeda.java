package br.com.alura.screenmatch.exercicios.atividade5;

public class ConversorMoeda implements ConvensaoFinanceira {
    private double valorDolar;

    public ConversorMoeda(double valor) {
        this.valorDolar = valor;
    }
    @Override
    public void converterDolarParaReal() {
        System.out.printf("\n$%.2f equivale a R$%.2f",valorDolar, valorDolar * 5.40);
    }
}
