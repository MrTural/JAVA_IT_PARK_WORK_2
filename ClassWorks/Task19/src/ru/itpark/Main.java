package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Rectangle a = new Rectangle("rect",4, 5);
        Square b = new Square("square", 2);
        Circle c = new Circle("circle", 3);

        Figure figures[] = {a, b, c};

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].area());
        }
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].perimeter());
        }

        boolean isEquals = a.equals(c);
        System.out.println(isEquals);
        // Figure figure = new Figure();

    }
}
