package br.com.alura.screenmatch.exercicios.atividade11;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        var pessoa1 = new Pessoa("Leandro",24);
        var pessoa2 = new Pessoa("Manuel", 23);
        var pessoa3 = new Pessoa("Francisco",22);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista de pessoas: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome());
        System.out.println("Lista de pessoas: ");
        for(Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }

    }
}
