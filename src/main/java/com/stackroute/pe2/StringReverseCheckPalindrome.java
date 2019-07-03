package com.stackroute.pe2;
/*to Reverse the given input & Check if it is a Palindrome.*/

public class StringReverseCheckPalindrome
{
    public static String checkPalindrome(String inputString)
    {
        String reverseString="";
        for(int loop= inputString.length()-1;loop>=0;loop--)
        {
            reverseString= reverseString + inputString.charAt(loop);  //Reversing the string
        }


        if(inputString.equals(reverseString))  //Checking whether inputString is equal to reverseString
        {
            return "The string is palindrome.";
        }
        else
        {
            return "The string is not palindrome.";
        }

    }

}
