package br.com.alura.screenmatch.exercicios.atividade3;

public class ContaBancaria {
    private String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("\nVocê depositou R$%.2f",valor);
        } else System.out.println("Valor inválido, tente novamente.");
    }

    public void sacar(double valor) {
        if(valor <= 0) {
            System.out.println("Você não pode sacar um valor negativo ou igual a 0");
        } else if(valor <= saldo) {
            saldo -= valor;
            System.out.printf("Você sacou R$%.2f",valor);
        } else System.out.println("Saldo indisponível");
    }

    public void mostrarInfo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: " + saldo);
    }
}
