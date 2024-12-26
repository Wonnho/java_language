package org.example.interfaceprac.library;

public abstract class LibraryItem implements Borrowable {
    //abstract 이기 때문에 반드시 구현할 필요가 없다.
    String title;
    int ID;
    boolean isBorrowed;

    public LibraryItem(String title,int ID) {
        this.title = title;
        this.ID=ID;
    }


}
