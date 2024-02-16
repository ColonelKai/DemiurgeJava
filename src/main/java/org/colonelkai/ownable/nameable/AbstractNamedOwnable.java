package org.colonelkai.ownable.nameable;

import org.colonelkai.ownable.Ownable;

public class AbstractNamedOwnable implements Nameable, Ownable {
    String name;
    String description;

    int owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }
}
