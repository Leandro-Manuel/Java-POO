import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {
        Titulo filme = new Titulo();
        filme.setNome("Como treinar o seu dragão");
        filme.setAnoDeLancamento(2018);
        filme.setAutor("James Gosling");
        filme.setDuracaoMinutos(180);
        filme.exibeFichaTecnica();

        filme.avaliar(5.5);
        filme.avaliar(3.5);
        filme.avaliar(9.0);

        System.out.println("quantidade de avaliações: " + filme.getTotalAvaliacao());
        System.out.println("Média de avaliação do filme: " + filme.pegarMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da série: " + lost.getDuracaoMinutos());

    }
}