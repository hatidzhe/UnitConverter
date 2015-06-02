package com.hatidzhe;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hatidzhe on 15-6-2.
 */
public class SerializerTest {

    @Test
    public void testTransformDouble() throws Exception {
        double output = 1.163;
        String output1 = Serializer.transformDouble(output);
        String expected = "1.163";
        assertEquals(expected, output1);


    }
}