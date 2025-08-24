package br.com.alura.screenmatch.exercicios.atividade13;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        String nome1 = "Leandro";
        String nome2 = "Manuel";
        String nome3 = "Francisco";

        nomes.add(nome1);
        nomes.add(nome2);
        nomes.add(nome3);

        for(String nome : nomes) {
            System.out.println(nome);
        }

        Cachorro dogue = new Cachorro("Scooby","Cinza","Vira-lata");
        dogue.fazerBarulho();


        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Arroz", 15.99);
        Produto produto2 = new Produto("Feijão", 17.49);
        Produto produto3 = new Produto("Carne Bovina",39.89);
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        double inicio = 0.0;

        for(Produto item : listaDeProdutos) {
            inicio += item.getPreco();
        }
        System.out.printf("\nMédia de preço dos produtos: R$%.2f", inicio / listaDeProdutos.size());

        ContaBancaria conta1 = new ContaBancaria("321",10);
        double maior = conta1.getSaldo();
        String numero = conta1.getNumeroDaConta();
        ContaBancaria conta2 = new ContaBancaria("123",95.05);
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        for (ContaBancaria conta : contas) {
            if(conta.getSaldo() > maior) {
                maior = conta.getSaldo();
                numero = conta.getNumeroDaConta();
            }
        }
        System.out.printf("\nA conta com o saldo maior é: %s / saldo: %.2f", numero, maior);
    }
}
