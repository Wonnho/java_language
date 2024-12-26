package org.example.interfaceprac.library;

public abstract class LobraryPhysicalItem extends LibraryItem {
    String location;

    public LobraryPhysicalItem(String title, int ID, String location) {
        super(title, ID);
        this.location = location;
    }

    abstract void findLocation();
}
