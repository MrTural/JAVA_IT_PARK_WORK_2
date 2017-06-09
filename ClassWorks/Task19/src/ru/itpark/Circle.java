package ru.itpark;

public class Circle extends Figure {
    private int r;

    public int getR() {
        return r;
    }

    public Circle(String name, int r) {
        super(name);
        this.r = r;
    }


    @Override
    public int area() {
        return (int)Math.PI * r *r;
    }

    @Override
    public int perimeter() {
        return (int)Math.PI * r * 2;
    }
}
