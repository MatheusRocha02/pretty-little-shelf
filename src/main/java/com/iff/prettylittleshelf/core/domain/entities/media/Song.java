package com.iff.prettylittleshelf.core.domain.entities.media;

import com.iff.prettylittleshelf.core.domain.ids.EntityId;

import java.time.Duration;
import java.time.LocalDate;

public record Song(
        EntityId id,
        String title,
        String artist,
        String bpm,
        String songKey,
        String lyrics,
        LocalDate releaseDate,
        Duration duration
) implements Media{ }
