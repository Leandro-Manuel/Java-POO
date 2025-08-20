package br.com.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void incluir(Audio audio) {
        if(audio.getClassificacao() > 6) {
            System.out.println( audio.getTitulo() + " é considerado sucesso!" );
        } else {
            System.out.println( audio.getTitulo() + " é um dos preferidos do momento.");
        }
    }
}
