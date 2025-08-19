package br.com.alura.screenmatch.calculo;

public class FiltroRecomendacao {

    public void filtro(Classificavel classificado) {
        if(classificado.getClassificacao() >= 4) {
            System.out.println("Melhor recomendável");
        } else if (classificado.getClassificacao() >= 2) {
            System.out.println("Queridinho no momento");
        } else {
            System.out.println("Vale a pena assistir");
        }
    }
}
