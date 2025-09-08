package br.com.alura.screenmatch.desafioFinal;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Gson gson = new Gson();
        ConsultaCep consultarCep = new ConsultaCep();
        var scanner = new Scanner(System.in);
        System.out.print("Digite o seu cep (apenas números): ");
        String cep = scanner.nextLine();
        Endereco enderecoR = null;
        try {
            enderecoR = consultarCep.consultar(cep);
            EnderecoN enderecoN = new EnderecoN(enderecoR);
            System.out.println(enderecoN);
            GeradorDeArquivo gerarArquivo = new GeradorDeArquivo();
            gerarArquivo.salvarJson(enderecoN);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro.");
        }
    }
}
