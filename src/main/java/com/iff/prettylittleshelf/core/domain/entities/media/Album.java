package com.iff.prettylittleshelf.core.domain.entities.media;

import com.iff.prettylittleshelf.core.domain.ids.EntityId;
import java.time.LocalDate;
import java.time.Duration;
import java.util.List;

public record Album(
        EntityId id,
        String title,
        String artist,
        List<Song> tracks,
        LocalDate releaseDate
) implements Media {

    // Método de Domínio: Calcula a duração total do álbum
    public Duration totalDuration() {
        return tracks.stream()
                .map(Song::duration) // Certifique-se que Song tenha o campo Duration
                .reduce(Duration.ZERO, Duration::plus);
    }

    // Método de Domínio: Quantidade de faixas
    public int trackCount() {
        return tracks.size();
    }
}