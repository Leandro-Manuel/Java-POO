package br.com.alura.screenmatch.exercicios.AtividadeJson;

// Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome, idade e cidade. Em seguida,
// implemente um programa que utiliza a biblioteca Gson para converter um JSON representando uma pessoa em um objeto do tipo Pessoa.

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        String jsonPessoa = "{\"Nome\":\"Rodrigo\",\"Idade\":20,\"Cidade\":\"Brasília\"}";
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        Pessoa pessoaR = gson.fromJson(jsonPessoa, Pessoa.class);
        Pessoa2 pessoa = new Pessoa2(pessoaR);
        System.out.println(pessoa);
        pessoa.setNome("Leandro");
        pessoa.setIdade(24);
        pessoa.setCidade("Recife");
        System.out.println(pessoa);

        //Modifique o programa do Exercício anterior para permitir a conversão de um JSON mesmo se alguns campos
        // estiverem ausentes ou se houver campos adicionais não representados no objeto Pessoa. Consulte a
        // documentação da biblioteca Gson para flexibilizar a conversão.

        String jsonPessoa2 = "{\"nome\":\"Manuel\",\"cidade\":\"Brasília\"}";
        Gson gson2 = new GsonBuilder().setLenient().create();
        Pessoa pessoaR2 = gson2.fromJson(jsonPessoa2, Pessoa.class);
        Pessoa2 pessoa2 = new Pessoa2(pessoaR2);
        System.out.println(pessoa2);
    }
}
