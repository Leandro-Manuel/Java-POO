package br.com.alura.screenmatch.principal;

// api usada: OMDb API / minha chave de api: a8824027

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PrincipalAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        var scanner = new Scanner(System.in);
        System.out.print("Digite o nome do filme: ");
        String nomeDoFilme = scanner.nextLine();
        String requisicao = "https://www.omdbapi.com/?t=" + nomeDoFilme + "&apikey=a8824027";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(requisicao))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
