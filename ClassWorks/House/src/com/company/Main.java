package com.company;

public class Main {

    public static void main(String[] args) {

        HouseBook book1 = HouseBook.getHouseBook();

        book1.writeHuman("Турал");
        book1.writeAreaRoom("Мажор", 52, 58);
    }

}
