package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseCheckPalindromeTest {
    StringReverseCheckPalindrome ob;
    @Before
    public void setUp() throws Exception
    {
        ob=new StringReverseCheckPalindrome();
    }
    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void givenStringIsNotPalindromeShouldReturnMessage()
    {

        String result = ob.checkPalindrome("hello");
        assertEquals("The string is not palindrome.",result);

    }
    @Test
    public void givenStringIsPalindromeShouldReturnMessage()
    {

        String result = ob.checkPalindrome("1221");
        assertEquals("The string is palindrome.",result);

    }

}