package org.example.composition;

public class Person {
    public String name;
    private Pencil pencil;
    private Pencil[] pencils;
    public Tool tool;

//    public Person(String name, Pencil pencil) {
//        this.pencil=pencil;
//        this.name=name;
//    }

    public void setPencil(Pencil pencil) {
        this.pencil = pencil;
    }

    public Person( String name,Tool tool) {
        this.tool = tool;
        this.name = name;
    }
//    public Person(String name,Pencil[] pencils) {
//        this.name=name;
//        this.pencils = pencils;
//    }

    public void WritingMany() {
        for(Pencil p:pencils) {
            p.write();
        }
    }

    public void Writing() {
        System.out.print("writing ");
        pencil.write();
//        System.out.println("Writing"+this.pencil.write());
//        System.out.println("Writing"+ null );
    }

    public void use() {
         tool.use();
    }
}
