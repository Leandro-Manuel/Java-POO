package br.com.alura.screenmatch.exercicios.atividade6;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double comprimento;
    private double largura;

    public CalculadoraSalaRetangular(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    @Override
    public void calcularArea() {
        System.out.printf("A área total da sala é %.2f metros quadrados.",comprimento * largura);
    }

    @Override
    public void calcularPerimetro() {
        System.out.printf("O perimetro total da sala é %.2f metros",(comprimento * 2) + (largura * 2));
    }
}
