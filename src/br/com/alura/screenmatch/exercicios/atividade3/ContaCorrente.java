package br.com.alura.screenmatch.exercicios.atividade3;

public class ContaCorrente extends ContaBancaria{

    private double tarifaMensal;
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
        tarifaMensal = 9.85;
    }

    public void cobrarTarifaMensal() {
        super.saldo -= tarifaMensal;
        System.out.printf("Foi deduzido R$%.2f da sua conta, valor referente a tarifa mensal da sua conta corrente.", tarifaMensal);
    }
}
