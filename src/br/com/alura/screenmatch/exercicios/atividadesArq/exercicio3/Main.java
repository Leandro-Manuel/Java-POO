package br.com.alura.screenmatch.exercicios.atividadesArq.exercicio3;

import com.google.gson.Gson;

// Defina uma classe chamada Veiculo com os atributos necessários.
// Em seguida, crie um programa que instancia um objeto Veiculo, serializa esse objeto para
// JSON usando a biblioteca Gson e imprime o resultado.
public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Honda","Civic","2018");
        Gson gson = new Gson();
        String json = gson.toJson(veiculo);
        System.out.println("Objeto veiculo serializado para JSON: ");
        System.out.println(json);
    }
}
