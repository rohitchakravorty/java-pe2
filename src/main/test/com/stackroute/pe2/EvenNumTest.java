package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {
    EvenNum ob;
    @Before
    public void setUp() throws Exception
    {
        ob=new EvenNum();
    }
    @After
    public void tearDown() throws Exception {
        ob=null;
    }
    @Test
    public void givenIntegerIsEvenShouldGiveTrue()
    {
        boolean result=ob.isEven(2);
        assertEquals(true,result);
    }
    @Test
    public void givenIntegerIsNotEvenShouldGiveFlase()
    {
        boolean result=ob.isEven(5);
        assertEquals(false,result);
    }
    @Test
    public void givenNotIntegerShouldReturErrorMessage()
    {
        boolean result=ob.isNumeric("abcd");
        assertEquals(false,result);
    }
}

