package br.com.alura.screenmatch.calculo;
import br.com.alura.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

//    public void inclui(Filme filme) {
//        tempoTotal += filme.getDuracaoMinutos();
//    }
//
//    public void inclui(Serie serie) {
//        tempoTotal += serie.getDuracaoMinutos();
//    }

    public void inclui(Titulo titulo) {
        tempoTotal+= titulo.getDuracaoMinutos();
    }
    public int getTempo() {
        return tempoTotal;
    }
}
