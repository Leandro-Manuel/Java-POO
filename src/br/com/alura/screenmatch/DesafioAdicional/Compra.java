package br.com.alura.screenmatch.DesafioAdicional;

public class Compra {
    public void realizarCompra(Cartao cartao, Produto produto) {
        if(produto.getValor() <= cartao.getLimite()) {
            cartao.setLimite(cartao.getLimite() - produto.getValor());
            System.out.printf("Compra realizada com sucesso! Seu limite atual: %.2f", cartao.getLimite());
            System.out.println();
        } else System.out.println("Limite insuficiente.");
    }
}
