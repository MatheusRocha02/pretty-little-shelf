package com.iff.prettylittleshelf.core.domain.entities.media;

import com.iff.prettylittleshelf.core.domain.ids.EntityId;
import java.time.LocalDate;
import java.time.Duration;

public record Movie(
        EntityId id,
        String title,
        String director,
        Duration duration,
        String genre,
        LocalDate releaseDate
) implements Media { }