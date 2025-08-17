package br.com.alura.screenmatch.exercicios.atividade2;

public class Gato extends Animal{

    private String raca;
    private String cor;
    public Gato(String nome, double peso, String raca, String cor) {
        super(nome, peso);
        this.raca = raca;
        this.cor = cor;
    }
    @Override
    public void emitirSom() {
        System.out.println("Miau miau");
    }

    public void aranharMoveis() {
        System.out.printf("%s está arranhando o movel",getNome());
    }
}
