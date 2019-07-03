package com.stackroute.pe2;
/*boolean method called isEven() in a class called EvenNumTest, which takes
an int as input and returns true if the input is even.*/
public class EvenNum {
    public static boolean isNumeric(String strNum)    //To validate the input
    {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
    public static boolean isEven(int number)    //Checking if the number is even or not
    {
        if(number%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
