package br.com.alura.screenmatch.exercicios.atividadesExceptions.Ex3;
public class ErroConsultaGithubException extends RuntimeException{
    public ErroConsultaGithubException(String mensagem) {
        super(mensagem);
    }
}
