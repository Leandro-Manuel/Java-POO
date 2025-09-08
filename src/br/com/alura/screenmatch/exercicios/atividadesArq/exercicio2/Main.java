package br.com.alura.screenmatch.exercicios.atividadesArq.exercicio2;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

// Defina uma classe chamada Titulo com os atributos necessários. Em seguida, crie um programa que
// instancia um objeto Titulo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.

// Modifique o programa anterior para que o JSON gerado seja formatado de maneira mais elegante.
// Utilize o método setPrettyPrinting para alcançar esse resultado.
public class Main {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("Legend","2004");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo);
        System.out.println(json);
    }
}
