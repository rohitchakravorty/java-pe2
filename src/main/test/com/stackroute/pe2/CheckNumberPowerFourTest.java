package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckNumberPowerFourTest {
    CheckNumberPowerFour ob;
    @Before
    public void setUp() throws Exception
    {
        ob=new CheckNumberPowerFour();
    }
    @After
    public void tearDown() throws Exception {
        ob=null;
    }
    @Test
    public void givenNumberIsPowerFourShouldReturnMessage()
    {
        String result=ob.isPowerFour(16);
        assertEquals("Yes",result);

    }
    @Test
    public void givenNumberIsNotPowerFourShouldReturnMessage()
    {
        String result=ob.isPowerFour(12);
        assertEquals("No",result);

    }
}