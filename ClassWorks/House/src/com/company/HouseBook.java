package com.company;

import java.io.FileOutputStream;

public class HouseBook {
    private static HouseBook instance;

    public static HouseBook getHouseBook() {
        return instance;
    }
    static {
        instance = new HouseBook("book.txt");
    }
    private FileOutputStream fileOutputStream;

    private HouseBook(String filename) {
        try {
            this.fileOutputStream = new FileOutputStream(filename);
        } catch(Exception er) {
            System.out.println("Проблема с файлом");
        }
    }

    public void writeHuman(String name) {
        name = name + "\n";
        try {
            byte namesAsButes [] = name.getBytes();
            fileOutputStream.write(namesAsButes);
        } catch (Exception er) {
            System.err.println("Проблема с файлом");
        }
    }
    public void writeAreaRoom(String name, int number, int area) {
        try {
            String text = name + " " + String.valueOf(number) + " " + String.valueOf(area);
           byte texts[] = text.getBytes();
        } catch (Exception er) {
            System.err.println("Проблема с файлом");
        }


    }
}
