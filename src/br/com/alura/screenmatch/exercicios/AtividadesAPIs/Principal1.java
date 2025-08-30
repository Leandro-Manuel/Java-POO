package br.com.alura.screenmatch.exercicios.AtividadesAPIs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta
// à API do Google Books. Solicite ao usuário que insira o título de um livro, e exiba as informações disponíveis
// sobre o livro retornado pela API.
public class Principal1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        var scanner = new Scanner(System.in);
        System.out.print("Insira o nome de um filme: ");
        String livro = scanner.nextLine();
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + livro;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
