package br.com.minhasmusicas.modelos;

public abstract class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private double classificacao;

    public void curtir() {
        totalCurtidas++;
    }

    public void reproduzir() {
        totalReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }
}
