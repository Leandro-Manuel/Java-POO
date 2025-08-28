package br.com.alura.screenmatch.exercicios.atividade15;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inicio();
        int escolha = scanner.nextInt();
        int condicao = 1;
        menu(escolha,condicao,scanner);
    }
    public static void inicio() {
        System.out.print("Professor: Digite 1 / Aluno: Digite 2: ");
    }

    public static void menu(int escolha, int condicao, Scanner scanner) {
        while(condicao != 0) {
            if(escolha == 1) {
                System.out.print("Informe o seu nome completo: ");
                String nomeProfessor = scanner.nextLine();
                scanner.next();
                System.out.print("Informe a sua idade: ");
                int idade = scanner.nextInt();
                System.out.print("Insira a sua matéria: ");
                scanner.next();
                String materia = scanner.nextLine();
                Professor professor = new Professor(nomeProfessor,idade,materia);
            } else if(escolha == 2) {

            } else {
                System.out.println("Encerrando o programa...");
                break;
            }
        }
    }
}
