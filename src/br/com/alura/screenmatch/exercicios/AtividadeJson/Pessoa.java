package br.com.alura.screenmatch.exercicios.AtividadeJson;

public record Pessoa(String nome, int idade, String cidade) {
    @Override
    public String toString() {
        return "Nome: " + this.nome + ", idade: " + this.idade + ", Cidade: " + this.cidade;
    }
}
