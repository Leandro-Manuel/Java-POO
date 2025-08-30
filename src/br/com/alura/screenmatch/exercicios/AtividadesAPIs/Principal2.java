package br.com.alura.screenmatch.exercicios.AtividadesAPIs;
//Crie um programa Java que utiliza as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta
// à API de moedas e exiba a cotação atual de uma moeda escolhida pelo usuário.

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        var scanner = new Scanner(System.in);
        System.out.print("Digite o nome da moeda para exibir sua cotação atual: ");
        String moeda = scanner.nextLine();
        String endereco = "https://economia.awesomeapi.com.br/last/" + moeda;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}
