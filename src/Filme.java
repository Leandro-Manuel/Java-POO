public class Filme {
    String nome;
    String autor;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacao;


    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Autor: " + autor);
    }

    void avaliar(double avaliacao) {
        if(avaliacao >= 0 && avaliacao <= 10) {
            somaDasAvaliacoes += avaliacao;
            totalAvaliacao++;
        } else System.out.println("Valor inválido, tente novamente.");
    }

    double pegarMedia() {
        return somaDasAvaliacoes / totalAvaliacao;
    }
}
