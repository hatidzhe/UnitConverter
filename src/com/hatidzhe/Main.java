package com.hatidzhe;

public class Main {

    public static void main(String[] args) {

        Converter conv = new Converter();
        conv.askForCalories();

        // getInput()
        String input = new java.util.Scanner( System.in ).nextLine();

        // doConversion()
        double value = Double.parseDouble(input);
        double result = value * 1.163;
        String result1 = Double.toString( result );

        // answer()
        System.out.println( input + "kcal sind " + result1 +"Wh");
   
    }
}
