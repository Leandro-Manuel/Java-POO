package br.com.alura.screenmatch.exercicios.atividade4;

public class Principal {
    public static void main(String[] args) {
        Produto computador = new Produto("Acer nitro 5",1559.85);
        System.out.println("Imposto do produto: " + computador.calcularImposto());

        Produto laptop = new Produto("Readmi A35",2450.90);
        System.out.println("Imposto do produto: " + laptop.calcularImposto());

        Servico corteDeCabelo = new Servico("Corte de cabelo masculino",45);
        System.out.println("Imposto do serviço: " + corteDeCabelo.calcularImposto());

        Servico massagemCorporal = new Servico("Massagem corporal",145);
        massagemCorporal.calcularImposto();
        System.out.println("Imposto do serviço: " + massagemCorporal.calcularImposto());

        CalculadoraTotal calculadora = new CalculadoraTotal();
        calculadora.aplicarImposto(computador);
        calculadora.aplicarImposto(laptop);
        calculadora.aplicarImposto(corteDeCabelo);
        calculadora.aplicarImposto(massagemCorporal);
        calculadora.mostrarTotalImposto();
    }
}
