package br.com.alura.screenmatch.DesafioAdicional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> listas = new ArrayList<>();
        var scanner = new Scanner(System.in);
        int condicao = 1;
        System.out.print("Digite o limite do cartão: ");
        Cartao cartao = new Cartao(scanner.nextDouble());
        scanner.nextLine();
        Produto produto = null;
        while(condicao != 0) {
            System.out.print("Digite a descrição da compra: ");
            String descricao = scanner.nextLine();
            System.out.print("Digite o valor do produto: ");
            produto = new Produto(descricao,scanner.nextDouble());
            Compra compra = new Compra();
            compra.realizarCompra(cartao, produto);
            listas.add(produto);
            System.out.print("Digite 0 para parar, ou qualquer outra para continuar: ");
            condicao = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("****************");
        System.out.println("COMPRAS REALIZADAS");
        Collections.sort(listas);
        for(Produto item : listas) {
            System.out.println(item.getNome() + " - R$" + item.getValor());
        }
        System.out.println("*****************");
        System.out.println();
        System.out.printf("Saldo do cartão: %.2f",cartao.getLimite());
    }
}
