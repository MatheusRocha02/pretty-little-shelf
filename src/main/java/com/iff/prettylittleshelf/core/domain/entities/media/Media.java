package com.iff.prettylittleshelf.core.domain.entities.media;

import com.iff.prettylittleshelf.core.domain.ids.EntityId;
import java.time.LocalDate;

public sealed interface Media permits Book, Movie, Song, Album{
    EntityId id();
    String title();
    LocalDate releaseDate();
}
