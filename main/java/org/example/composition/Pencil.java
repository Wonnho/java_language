package org.example.composition;

public class Pencil  implements Tool{
    protected String color;

    public Pencil(String color) {
        this.color = color;
    }

    public void write() {
        System.out.println("write a sentence in pencil colored by"+color);
//        return "";
    }

    @Override
    public void use() {
        write();
    }
}
