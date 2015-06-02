package com.hatidzhe;

public class Main {

    public static void main(String[] args) {

        Converter conv = new Converter(System.in, System.out);
        conv.askForCalories();

        conv.getInput();

        conv.doConversion();

        conv.answer();
    }
}
