package com.polymorphism;

public abstract class AbstractBoard {
    private String message;
    private double size;
    private String kind;

    public AbstractBoard(String message, double size, String kind) {
        this.message = message;
        this.size = size;
        this.kind = kind;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "WhiteBoard{" +
                "message='" + message + '\'' +
                ", size=" + size +
                ", kind='" + kind + '\'' +
                '}';
    }
}
