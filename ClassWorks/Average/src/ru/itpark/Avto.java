package ru.itpark;

/**
 * Created by Student5 on 12.05.2017.
 */
public class Avto {
    String model;
    int number;
    int probek;
    int toplivo;

    // Конструктор пользовательский без параметров
    Avto() {
        model = "Touota";
        number = 111;
        probek = 30;
        toplivo = 45;
    }
    // Конструктор пользовательский с параметрами
    Avto(String model, int number, int probek, int toplivo) {
        this.model = model;
        this.number = number;
        this.probek = probek;
        this.toplivo = toplivo;
    }

    // Конструктор пользовательский копирования
    Avto(Avto original) {
        model = original.model;
        number = original.number;
        probek = original.probek;
        toplivo = original.toplivo;
    }
    double marksAverage() {
        double average = (this.probek*1.0 / this.toplivo);
        return average;
    }
}
