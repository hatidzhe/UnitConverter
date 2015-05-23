package com.hatidzhe;

public class Main {

    public static void main(String[] args) {
	
       System.out.println("Wie viele kcal sind umzuwandeln?");
       String input = new java.util.Scanner( System.in ).nextLine();
       double value = Double.parseDouble(input);
       double result = value * 1.163;
       String result1 = Double.toString( result );
       System.out.println( input + "kcal sind " + result1 +"Wh");
   
    }
}
