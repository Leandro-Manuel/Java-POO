package br.com.alura.screenmatch.exercicios.atividade15;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Professor: Digite 1 / Aluno: Digite 2: ");
        int escolha = scanner.nextInt();
        int condicao = 1;

        while(condicao != 0) {
            switch(condicao) {
                case 1:
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Valor ");
            }
        }

    }
}
