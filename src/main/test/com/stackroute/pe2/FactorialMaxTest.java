package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialMaxTest {

    @Test
    public void givenIntFactorialShouldReturnTrue() {
        boolean result=FactorialMax.listIntFactorial();
        assertEquals(true,result);
    }

    @Test
    public void givenLongFactorialShouldReturnTrue() {
        boolean result=FactorialMax.listLongFactorial();
        assertEquals(true,result);
    }
}

