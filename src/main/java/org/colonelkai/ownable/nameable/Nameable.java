package org.colonelkai.ownable.nameable;

public interface Nameable {

    String name = null;

    String description = null;

    default String getName() {
        return name;
    }

    default void setName(String name) {
        this.name = name;
    }

    default String getDescription() {
        return description;
    }

    default void setDescription(String description) {
        this.description = description;
    }
}
