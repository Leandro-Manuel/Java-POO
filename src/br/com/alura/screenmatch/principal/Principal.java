package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme("Como treinar o seu dragão", 2018);
        filme.setDiretor("Leandro Manuel");
        filme.setAutor("James Gosling");
        filme.setDuracaoMinutos(180);
        filme.exibeFichaTecnica();

        filme.avaliar(5.5);
        filme.avaliar(3.5);
        filme.avaliar(9.0);

        System.out.println("quantidade de avaliações: " + filme.getTotalAvaliacao());
        System.out.println("Média de avaliação do filme: " + filme.pegarMedia());

        Filme outroFilme = new Filme("BladeRunner", 2014);
        outroFilme.setDiretor("Scotfield");
        outroFilme.setAutor("Disney");
        outroFilme.setDuracaoMinutos(100);

        Serie lost = new Serie("Lost",2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da série: " + lost.getDuracaoMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Minutos totais: " + calculadora.getTempo());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtro(filme);

        Episodio episodio = new Episodio();
        episodio.setNome("Piloto");
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(1001);
        filtro.filtro(episodio);

        Filme outroFilme3 = new Filme("Procurando Nemo", 2000);
        outroFilme3.setDiretor("Leandro");
        outroFilme3.setAutor("Pixar");
        outroFilme3.setDuracaoMinutos(120);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(outroFilme3);
        System.out.println("quantidade de filmes: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes);
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).toString());


    }
}