package com.stackroute.pe2;

public class StringReverseCheckPalindrome {
    public static String checkPalindrome(String inputString)
    {
        String reverseString="";
        for(int loop= inputString.length()-1;loop>=0;loop--)
        {
            reverseString= reverseString + inputString.charAt(loop);
        }


        if(inputString.equals(reverseString))
        {
            return "The string is palindrome.";
        }
        else
        {
            return "The string is not palindrome.";
        }

    }

}
