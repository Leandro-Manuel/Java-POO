package br.com.alura.screenmatch.exercicios.atividadesExceptions.Ex1;

import java.util.Scanner;

// Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
// Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        try {
            System.out.print("Digite um número: ");
            int numero1 = scanner.nextInt();
            System.out.print("Digite outro número: ");
            int numero2 = scanner.nextInt();
            int divisao = numero1 / numero2;
            System.out.println("Resultado da divisão dos números: " + divisao);
        } catch(ArithmeticException e) {
            System.out.println("Não é possível dividir um número por 0.");
        }
    }
}
