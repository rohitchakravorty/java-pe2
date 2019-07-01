package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradesComputingTest{
    GradesComputing ob;
    @Before
    public void setUp() throws Exception
    {
        ob=new GradesComputing();
    }
    @After
    public void tearDown() throws Exception {
        ob=null;
    }
    @Test
    public void givenGradesShouldReturnAverage()
    {
        double result=ob.checkAverage(new int[]{85, 65, 98, 77});
        assertEquals(81.25,result,0.0);

    }
    @Test
    public void givenGradesShouldReturnMin()
    {
        int result=ob.checkMin(new int[]{85, 65, 98, 77});
        assertEquals(65,result);

    }
    @Test
    public void givenGradesShouldReturnMax()
    {
        int result=ob.checkMax(new int[]{85, 65, 98, 77});
        assertEquals(98,result);

    }
}