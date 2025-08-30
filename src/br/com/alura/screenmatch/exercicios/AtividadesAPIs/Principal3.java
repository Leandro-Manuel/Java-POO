package br.com.alura.screenmatch.exercicios.AtividadesAPIs;
//Crie um programa Java que faça uma consulta à API do TheMealDB utilizando as classes HttpClient, HttpRequest e
// HttpResponse. Solicite ao usuário que insira o nome de uma receita e exiba as informações disponíveis sobre essa receita.

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        var scanner = new Scanner(System.in);
        System.out.print("Insira um nome de um prato e receba a receita: ");
        var receita = scanner.nextLine();
        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + receita;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}
