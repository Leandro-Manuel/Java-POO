import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Como treinar o seu dragão");
        filme.setAnoDeLancamento(2018);
        filme.setDiretor("Leandro Manuel");
        filme.setAutor("James Gosling");
        filme.setDuracaoMinutos(180);
        filme.exibeFichaTecnica();

        filme.avaliar(5.5);
        filme.avaliar(3.5);
        filme.avaliar(9.0);

        System.out.println("quantidade de avaliações: " + filme.getTotalAvaliacao());
        System.out.println("Média de avaliação do filme: " + filme.pegarMedia());

        Filme outroFilme = new Filme();
        outroFilme.setNome("BladeRunner");
        outroFilme.setAnoDeLancamento(2014);
        outroFilme.setDiretor("Scotfield");
        outroFilme.setAutor("Disney");
        outroFilme.setDuracaoMinutos(100);

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
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


    }
}