package br.com.alura.screenmatch.exercicios.atividade12;
import java.util.ArrayList;

public class ListaDeProdutos {
    private ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        listaDeProdutos.add(produto);
    }

    public int getTamanhoDaLista() {
        return listaDeProdutos.size();
    }

    public String getProdutoPorIndice(int indice) {
        return listaDeProdutos.get(indice).getNome();
    }

    public void getElementos() {
        System.out.println(listaDeProdutos);
    }
}
