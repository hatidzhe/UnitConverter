package com.hatidzhe;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hatidzhe on 15-5-27.
 */
public class ParserTest {

    @Test
    public void testTransformString() throws Exception {
        String input = "6";
        double input1 = Parser.transformString(input);
        double expectedResult = 6;
        assertEquals(expectedResult, input1, 0);
    }

    @Test
    public void testUnexpectedInput() throws Exception {
        String input = "hase";
        double input1 = Parser.transformString(input);
        double expected = 0;
        assert(input1 == expected);
    }
}