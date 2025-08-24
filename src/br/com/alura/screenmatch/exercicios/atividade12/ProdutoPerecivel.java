package br.com.alura.screenmatch.exercicios.atividade12;

public class ProdutoPerecivel extends Produto{

    private String dataDevalidade;
    public ProdutoPerecivel(String nome, double valor, int quantidade, String dataDevalidade) {
        super(nome, valor, quantidade);
        this.dataDevalidade = dataDevalidade;
    }

    public String getDataDevalidade() {
        return this.dataDevalidade;
    }

    public void imprimirInfo() {
        System.out.println("Nome do produto: " + getNome() + " / valor: " + getValor() + " / quantidade: " + getQuantidade() + " / data de validade: " + getDataDevalidade());
    }
}
