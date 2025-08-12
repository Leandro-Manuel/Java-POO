public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "Como treinar seu dragão";
        filme.anoDeLancamento = 2008;
        filme.autor = "James gosling";
        filme.exibeFichaTecnica();

        filme.avaliar(5.5);
        filme.avaliar(3.5);
        filme.avaliar(9.0);

        System.out.println("quantidade de avaliações: " + filme.totalAvaliacao);
        System.out.println("Média de avaliação do filme: " + filme.pegarMedia());

    }
}