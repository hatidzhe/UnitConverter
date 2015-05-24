package com.hatidzhe;

/**
 * Created by hatidzhe on 15-5-22.
 */
public class Converter {
    private String input;
    private double kcal;
    private double Wh;
    private String output;

    public void askForCalories() {
        System.out.println("Wie viele kcal sind umzuwandeln?");
    }

    public void getInput() {
        input = new java.util.Scanner(System.in).nextLine();

    }

    public void doConversion() {
        kcal = Double.parseDouble(input);
        Wh = Calculator.kcalToWh(kcal);
        output = Double.toString(Wh);
    }

        public void answer() {
            System.out.println(input + "kcal sind " + output + "Wh");

        }


    }

