package com.hatidzhe;

/**
 * Created by hatidzhe on 15-5-24.
 */
      public class Parser {
    String input;
    String ex;


    public static double transformString(String input) {

        try {
            double input1 = Double.parseDouble(input);
            return input1;
        } catch (NumberFormatException ex) {
            return 0 ;
        }
    }
}
