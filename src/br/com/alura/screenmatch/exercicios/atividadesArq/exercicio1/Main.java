package br.com.alura.screenmatch.exercicios.atividadesArq.exercicio1;

// Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt":
// "Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io.

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter arquivo = new FileWriter("arquivo.txt");
        String mensagem = "conteúdo a ser gravado no arquivo.";
        arquivo.write(mensagem);
        arquivo.close();

    }

}
