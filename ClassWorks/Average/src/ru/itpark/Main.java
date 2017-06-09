package ru.itpark;

public class Main {

    public static void main(String[] args) {
	Avto touota = new Avto("Touota", 111, 30, 45 );
        double marksAverageOfTouota = touota.marksAverage();
        System.out.println(marksAverageOfTouota);
    }
}
