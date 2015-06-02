package com.hatidzhe;

import java.io.InputStream;
import java.io.PrintStream;

/**
 * Created by hatidzhe on 15-5-22.
 */
public class Converter {

    private String input;
    private double input1;
    private double output1;
    private String output;

    private InputStream in;
    private PrintStream out;

    public Converter(InputStream in, PrintStream out) {
        this.in = in;
        this.out = out;
    }

    public void askForCalories() {
        this.out.println("Wie viele kcal sind umzuwandeln?");
    }

    public void getInput() {
        input = new java.util.Scanner(this.in).nextLine();
    }



    public void doConversion() {
        input1 = Parser.transformString(input);
        output1 = Calculator.kcalToWh(input1);
        output = Serializer.transformDouble(output1);
    }

    public void answer() {
        this.out.println(input + " kcal sind " + output1 + " Wh");
    }

}

