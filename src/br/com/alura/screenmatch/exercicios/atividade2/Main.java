package br.com.alura.screenmatch.exercicios.atividade2;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Pluto",4.5,"Frajola","Preto e branco");
        gato.emitirSom();
        gato.aranharMoveis();

        Cachorro cachorro = new Cachorro("Scoob",14.5,"Vira-lata","Médio");
        cachorro.roerOsso();
        cachorro.emitirSom();
    }
}
