package br.com.alura.screenmatch.exercicios.atividadesExceptions.Ex3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

// Desenvolva um programa em Java que permite aos usuários consultar informações sobre um usuário
// do GitHub (utilize a API pública do GitHub para obter os dados). Crie uma classe de exceção
// personalizada, ErroConsultaGitHubException, que estende RuntimeException. Lance essa exceção quando o
// nome de usuário não for encontrado. No bloco catch, trate de forma específica essa exceção,
// exibindo uma mensagem amigável.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        var scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome de usuário do Github: ");
        var user = scanner.nextLine().replace(" ", "-");

        String endereco = "https://api.github.com/users/" + user;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGithubException("Usuário não encontrado!");
            }
            System.out.println("Informação do usuário: " + response.body());
        } catch (IOException | InterruptedException e) {
            System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
            e.printStackTrace();
        } catch (ErroConsultaGithubException e) {
            System.out.println(e.getMessage());
        }
    }
}
