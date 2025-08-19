package br.com.alura.screenmatch.exercicios.atividade7;

public class TabuadaMultiplicacao implements Tabuada {
    private int numero;
    public TabuadaMultiplicacao(int valor) {
        this.numero = valor;
    }
    @Override
    public void mostrarTabuada() {
        if(numero > 1 && numero <= 9) {
            for(int x = 1; x <= 10; x++) {
                System.out.printf("%n%d x %d = %d",this.numero, x , this.numero * x);
            }
        } else {
            System.out.println("Digite um número entre 2 a 9.");
        }
    }
}
