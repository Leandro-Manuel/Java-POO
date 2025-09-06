package br.com.alura.screenmatch.exercicios.AtividadeJson;

public class Pessoa2 {
    private String nome;
    private int idade;
    private String cidade;

    public Pessoa2(Pessoa pessoa) {
        this.nome = pessoa.nome();
        this.idade = pessoa.idade();
        this.cidade = pessoa.cidade();
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" + "Idade: " + this.idade + "\n" + "Cidade: " + this.cidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
