package br.com.alura.screenmatch.exercicios.atividade15;

import java.util.ArrayList;
import java.util.Collections;

public class Professor extends Pessoa{
    private String materia;

    private ArrayList<Aluno> turma;

    public Professor(String nome, int idade, String materia) {
        super(nome, idade);
        this.materia = materia;
        turma = new ArrayList<>();
    }

    public void AdicionarAlunoNaMateria(Aluno aluno) {
        turma.add(aluno);
        System.out.println("Aluno adicionado na matéria com sucesso!");
    }

    public void mostrarAlunos() {
        for(Aluno aluno : turma) {
            System.out.println("Aluno: " + aluno.getNome());
        }
    }

    public String getMateria() {
        return this.materia;
    }

    public void mostrarAlunosEmOrdemAlfabetica() {
        Collections.sort(turma);
        for (Aluno aluno : turma) {
            System.out.println("Aluno: " + aluno.getNome());
        }
    }
}
