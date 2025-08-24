package br.com.alura.screenmatch.exercicios.atividade13;

public class ContaBancaria {
    private String numeroDaConta;
    private double saldo;

    public ContaBancaria(String numero, double saldo) {
        this.numeroDaConta = numero;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNumeroDaConta() {
        return this.numeroDaConta;
    }
}
