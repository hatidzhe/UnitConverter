package com.hatidzhe;

/**
 * Created by hatidzhe on 15-5-22.
 */
public class Converter {
    private String input;
    private double value;
    private double result;
    private String result1;

    public void askForCalories() {
        System.out.println("Wie viele kcal sind umzuwandeln?");
    }

    public void getInput() {
        input = new java.util.Scanner(System.in).nextLine();

    }
    public void doConversion(){
        double value = Double.parseDouble(input);
        double result = value * 1.163;
        String result1 = Double.toString( result );


    }
}
