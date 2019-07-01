package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReadAndPrintTest {
    ReadAndPrint object = new ReadAndPrint();

    @Test
    public void givenCorrectFileShouldReturnResult() throws Exception {
        long result = object.readPrint("./test.txt");
        assertEquals(45,result);

    }

}