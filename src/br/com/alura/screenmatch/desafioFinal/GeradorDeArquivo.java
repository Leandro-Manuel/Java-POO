package br.com.alura.screenmatch.desafioFinal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void salvarJson(EnderecoN endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter arquivo = new FileWriter(endereco.getCep() + ".json");
        arquivo.write(gson.toJson(endereco));
        arquivo.close();

    }
}
