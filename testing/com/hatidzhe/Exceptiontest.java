package com.hatidzhe;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hatidzhe on 15-6-2.
 */
public class Exceptiontest {

    @Test
    public void testTransformString() throws Exception {

                String input = "hase";
                double input1 = Parser.transformString(input);
                double expected = 0;
                assert(input1 == expected);


            }
        }


