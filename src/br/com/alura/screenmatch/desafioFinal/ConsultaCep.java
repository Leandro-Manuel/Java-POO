package br.com.alura.screenmatch.desafioFinal;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {
    public Endereco consultar(String cep) throws IOException, InterruptedException {
        Gson gson = new Gson();
        String endereco = "https://viacep.com.br/ws/" + cep + "/json/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            return gson.fromJson(json, Endereco.class);
        } catch(Exception e) {
            throw new RuntimeException("Ocorreu um erro!");
        }
    }
}
