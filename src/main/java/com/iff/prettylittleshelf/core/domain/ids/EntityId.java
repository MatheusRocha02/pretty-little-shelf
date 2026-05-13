package com.iff.prettylittleshelf.core.domain.ids;

import java.util.UUID;


public record EntityId(String prefix, UUID value) {

    @Override
    public String toString() {
        return prefix + "_" + value.toString().replace("-", "");
    }

    public static EntityId generate(String prefix){
        return new EntityId(prefix, UUID.randomUUID());
    }
}
