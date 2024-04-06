package org.dio.models;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    private List<String> musicas;

    public ReprodutorMusical(List<String> musicas) {
        this.musicas = musicas;
    }

    public List<String> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<String> musicas) {
        this.musicas = musicas;
    }

    public String tocar() {
        return String.format("Tocando a música: %s", getMusicas().getFirst());
    }

    public String pausar() {
        return String.format("Pausando a música: %s", getMusicas().getFirst());
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musicaSelecionada(musica));
    }

    private String musicaSelecionada(String musica) {
        List<String> musicasSelecionadas = new ArrayList<>(musicas);

        if (!musicasSelecionadas.isEmpty()) {
            return musicasSelecionadas.stream()
                    .filter(musicaSelecionada -> !musicaSelecionada.isEmpty() && musicaSelecionada.equals(musica))
                    .toList().toString();
        } else {
            return "Nenhuma música no aparelho.";
        }
    }
}
