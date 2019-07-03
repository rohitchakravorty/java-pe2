package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialMaxTest {
    FactorialMax ob;
    @Before
    public void setUp() throws Exception
    {
        ob=new FactorialMax();
    }
    @After
    public void tearDown() throws Exception {
        ob=null;
    }

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

