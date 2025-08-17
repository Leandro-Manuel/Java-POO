package br.com.alura.screenmatch.exercicios.atividade2;

public class Cachorro extends Animal{
    private String raca;
    private String porte;


    public Cachorro(String nome, double peso, String raca, String porte) {
        super(nome, peso);
        this.raca = raca;
        this.porte = porte;
    }

    @Override
    public void emitirSom() {
        System.out.print("\nAu au au!");
    }

    public void abanarRabo() {
        System.out.printf("\n%s está abanando o rabo.",getNome());
    }

    public void roerOsso() {
        System.out.printf("\n%s está roendo o osso.",getNome());
    }
}
