package br.com.alura.screenmatch.exercicios.atividade15;

import java.util.ArrayList;

public class Aluno extends Pessoa implements Comparable<Aluno>{
    private ArrayList<Double> notas;
    public Aluno(String nome, int idade) {
        super(nome, idade);
        notas = new ArrayList<>();
    }

    @Override
    public void info() {
        System.out.println("Nome do aluno: " + getNome());
        System.out.println("Idade: " + getIdade());
        mostrarNotas();
    }

    public void adicionarNota(double valor) {
        if(valor >= 0 && valor <= 10) {
            notas.add(valor);
            System.out.println("Nota adicionada com sucesso!");
        } else {
            System.out.println("Valor inválido, tente novamente.");
        }
    }

    private void mostrarNotas() {
        for(double nota : notas) {
            System.out.println("Nota: " + nota);
        }
    }
    public double pegarMedia() {
        double media = 0;
        for (Double valor : notas) {
            media += valor;
        }
        return media / notas.size();
    }
    @Override
    public int compareTo(Aluno outroAluno) {
        return this.getNome().compareTo(outroAluno.getNome());
    }
}
