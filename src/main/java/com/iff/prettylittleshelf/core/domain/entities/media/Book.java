package com.iff.prettylittleshelf.core.domain.entities.media;

import com.iff.prettylittleshelf.core.domain.ids.EntityId;
import java.time.LocalDate;

public record Book(
        EntityId id,
        String title,
        String author,
        String isbn,
        Integer pages,
        String publisher,
        LocalDate releaseDate
) implements Media { }