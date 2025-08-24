package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalListas {
    public static void main(String[] args) {
        Filme filme = new Filme("Como treinar o seu dragão", 2018);
        filme.avaliar(9);
        Filme outroFilme = new Filme("BladeRunner", 2014);
        outroFilme.avaliar(6);
        Filme outroFilme3 = new Filme("Procurando Nemo", 2000);
        outroFilme3.avaliar(10);
        Serie lost = new Serie("Lost",2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme);
        lista.add(outroFilme);
        lista.add(outroFilme3);
        lista.add(lost);

        for(Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme film) {
                System.out.println("Classificacao: " + film.getClassificacao());
            }
        }
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano:");
        System.out.println(lista);



    }
}
