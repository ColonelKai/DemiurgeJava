package org.colonelkai.ownable;

public abstract class AbstractOwnable implements Ownable {
    int owner;

    @Override
    public int getOwner() {
        return owner;
    }

    @Override
    public void setOwner(int owner) {
        this.owner = owner;
    }
}
