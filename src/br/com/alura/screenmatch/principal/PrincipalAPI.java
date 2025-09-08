package br.com.alura.screenmatch.principal;
// api usada: OMDb API / minha chave de api: a8824027
// para transformar um json em objetos importamos uma biblioteca do google: Gson, no site mvn repository
// baixamos o jar do Gson
import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAno;
import br.com.alura.screenmatch.modelo.Titulo;
import br.com.alura.screenmatch.modelo.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PrincipalAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        var scanner = new Scanner(System.in);
        String nomeDoFilme= "";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(!nomeDoFilme.equalsIgnoreCase("sair")) {
            System.out.print("Digite o nome do filme: ");
            nomeDoFilme = scanner.nextLine();

            if (nomeDoFilme.equalsIgnoreCase("sair")) break;
            String requisicao = "https://www.omdbapi.com/?t=" + nomeDoFilme.replace(" ", "+") + "&apikey=a8824027";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(requisicao))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Convertido: " + meuTitulo);

                titulos.add(meuTitulo);

                //FileWriter escrita = new FileWriter("filmes.txt");
                //escrita.write(meuTitulo.toString());
                //escrita.close();
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro de argumento na busca");
            } catch (ErroDeConversaoDeAno e) {
                System.out.println(e.getMensagem());
            }
        }
        System.out.println(titulos);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("O programa finalizou corretamente!");
    }
}
