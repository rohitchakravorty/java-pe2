package com.stackroute.pe2;
/*to check if a given number is power of 4*/
public class CheckNumberPowerFour
{
    public static boolean isNumeric(String strNum)    //To validate the input
    {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
    public static String isPowerFour(int inputNum)
    {
        if(inputNum==1)
        {
            return "No";
        }
        for(int loop=1;loop<=inputNum;loop*=4) //To check if the inputNum is power of 4 or not
        {
            if(inputNum==loop)
            {
                return "Yes";
            }
        }
        return "No";

    }
}
