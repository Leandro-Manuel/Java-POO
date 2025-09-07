package br.com.alura.screenmatch.exercicios.atividadesExceptions.Ex2;

public class SenhaInvalidaException extends RuntimeException{
    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
