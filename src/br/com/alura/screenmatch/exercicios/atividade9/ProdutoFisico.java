package br.com.alura.screenmatch.exercicios.atividade9;

public class ProdutoFisico extends Item implements Calculavel{
    private double taxaEntrega = 10;

    private boolean descontoativado = false;

    @Override
    public double calcularPrecoFinal() {
        if(getPreco() > 100) {
            descontoativado = true;
            return (getPreco() + taxaEntrega) - getDesconto();
        } else {
            return (getPreco() + taxaEntrega);
        }
    }

    @Override
    public void mostrarInformacao() {
        System.out.print("\n----------------------------\n");
        System.out.println("Preço do produto: " + getPreco());
        System.out.println("Taxa de entrega: " + this.taxaEntrega);
        System.out.println("Desconto aplicado: " + this.descontoativado);
        System.out.printf("\nPreço final do produto considerando desconto e taxa adicional é %.2f reais.",calcularPrecoFinal());
        System.out.println("\n----------------------------\n");
    }
}
