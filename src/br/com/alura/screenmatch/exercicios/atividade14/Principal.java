package br.com.alura.screenmatch.exercicios.atividade14;
import java.util.ArrayList;
import java.util.Collections;
public class Principal {
    public static void main(String[] args) {
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(new Titulo("Leo"));
        lista.add(new Titulo("Abner"));
        lista.add(new Titulo("Bjorn"));
        lista.add(new Titulo("Samuel"));

        // Collections.sort serve para ordenar uma lista, tanto em ordem alfabetica, tanto em ordem crescente (numeros).

        Collections.sort(lista);

        for(Titulo pessoa : lista) {
            System.out.println("Nome: " + pessoa.getNome());
        }
    }
}
