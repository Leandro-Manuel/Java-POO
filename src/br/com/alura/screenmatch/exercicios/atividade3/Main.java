package br.com.alura.screenmatch.exercicios.atividade3;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Leandro Manuel Francisco",599.99);
        conta.mostrarInfo();
        conta.depositar(15.99);
        System.out.println(conta.getSaldo());

        ContaBancaria conta2 = new ContaCorrente("Manuel",200.91);
        ((ContaCorrente) conta2).cobrarTarifaMensal();
        conta2.mostrarInfo();

    }
}
