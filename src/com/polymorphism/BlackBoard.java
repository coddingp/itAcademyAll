package com.polymorphism;

public class BlackBoard extends AbstractBoard implements Writable{
    private String kind = super.getKind();
    public BlackBoard(String message, double size, String kind) {
        super(message, size, kind);
        write();
    }
    @Override
    public void write() {
//        System.out.println(this.kind);
        if (this.kind.equals("BlackBoard")){

            System.out.println("Write with a chalk");
        }
    }

    @Override
    public void read() {
        System.out.println(" you can read from it");
    }
}
