package br.com.minhasmusicas.modelos;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Oceano");
        minhaMusica.setAlbum("Piloto");
        minhaMusica.setArtista("Djavan");
        minhaMusica.setGenero("Mpb brasileiro");

        for (int i = 0; i < 100; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 100; i++) {
            minhaMusica.curtir();
        }

        Podcast flowPodcast = new Podcast();
        flowPodcast.setApresentador("Monark");
        flowPodcast.setDescricao("Uma breve apresentação sobre o assunto");
        flowPodcast.setTitulo("Uso da Ia na tecnologia");

        for (int i = 0; i < 500; i++) {
            flowPodcast.reproduzir();
        }

        for (int i = 0; i < 250; i++) {
            flowPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.incluir(minhaMusica);
        preferidas.incluir(flowPodcast);
    }
}
