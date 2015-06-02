package com.hatidzhe;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by samuel on 6/2/15.
 */
public class ConverterTest {

    @Test
    public void testDoConversion() throws Exception {

        String input = "5\n";
        ByteArrayInputStream  inputstream = new ByteArrayInputStream( input.getBytes("UTF-8") );
        ByteArrayOutputStream outputstream = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream( outputstream );

        Converter conv = new Converter( inputstream, printstream );
        conv.askForCalories();

        String output1 = outputstream.toString();
        assertEquals( output1, "Wie viele kcal sind umzuwandeln?\n" );
        outputstream.reset();

        conv.getInput();
        conv.doConversion();
        conv.answer();

        String output2 = outputstream.toString();
        assertEquals( output2, "5 kcal sind 5.815 Wh\n" );
    }
}