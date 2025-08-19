package br.com.alura.screenmatch.exercicios.atividades8;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    private double valorCelsius;
    private double valorFahrenheit;

    public void setValorCelsius(double valor) {
        this.valorCelsius = valor;
    }

    public void setValorFahrenheit(double valor) {
        this.valorFahrenheit = valor;
    }
    @Override
    public void CelsiusParaFahrenheit() {
        System.out.printf("%n%.2f celsius equivale a %.2f fahrenheit.",valorCelsius, (valorCelsius * 1.8) + 32);
    }

    @Override
    public void FahrenheitParaCelsius() {
        System.out.printf("%n%.2fF equivale a %.2fC",valorFahrenheit, (valorFahrenheit - 32) * 0.555);
    }
}
