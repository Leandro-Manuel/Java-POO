package br.com.alura.screenmatch.exercicios.atividadeJson2;
import br.com.alura.screenmatch.exercicios.AtividadeJson.Livro;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

// Crie uma classe Livro que contenha atributos como título, autor e um objeto representando a editora.
// Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON aninhado representando
// um livro em um objeto do tipo Livro.

public class Principal {
    public static void main(String[] args) {
        String json = "{\"Titulo\":\"Legend\",\"Autor\":\"Leandro\",\"Editora\":{\"Nome\":\"TechBooks\",\"Cidade\":\"São Paulo\"}}";
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        LivroR livro = gson.fromJson(json, LivroR.class);
        System.out.println(livro);
        Livro livro2 = new Livro(livro);
        System.out.println(livro2);
    }
}
