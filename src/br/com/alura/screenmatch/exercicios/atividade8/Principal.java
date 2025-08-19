package br.com.alura.screenmatch.exercicios.atividade8;

public class Principal {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.setValorCelsius(24.5);
        conversor.setValorFahrenheit(112);

        conversor.CelsiusParaFahrenheit();
        conversor.FahrenheitParaCelsius();
    }
}
