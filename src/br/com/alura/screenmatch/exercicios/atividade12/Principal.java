package br.com.alura.screenmatch.exercicios.atividade12;
public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Feijão", 9.85, 30);
        Produto produto2 = new Produto("Arroz", 11.10,54);
        Produto produto3 = new Produto("Batata",6.75,30);

        ListaDeProdutos lista = new ListaDeProdutos();
        lista.adicionarProduto(produto1);
        lista.adicionarProduto(produto2);
        lista.adicionarProduto(produto3);

        System.out.println("Tamanho da lista de produtos: " + lista.getTamanhoDaLista());
        System.out.println("Pegar produto pelo elemento 1: " + lista.getProdutoPorIndice(1));

        lista.getElementos();
        ProdutoPerecivel produto4 = new ProdutoPerecivel("Iogurte",15.99,3, "15/10/2025");
        lista.adicionarProduto(produto4);

        produto4.imprimirInfo();
        System.out.println(lista.getTamanhoDaLista());


    }
}
