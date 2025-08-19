package br.com.alura.screenmatch.exercicios.atividade4;

public class CalculadoraTotal {
    private double impostoTotal;

    public void aplicarImposto(Tributavel objeto) {
        impostoTotal += objeto.calcularImposto();
        System.out.println("Imposto adicionado!");
    }

    public double getImpostoTotal() {
        return impostoTotal;
    }

    public void mostrarTotalImposto() {
        System.out.println("Total de imposto a ser pago: " + this.impostoTotal);
    }
}
