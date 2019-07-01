package com.stackroute.pe2;

public class CheckNumberPowerFour {
    public static String isPowerFour(int inputNum)
    {
        if(inputNum==1)
        {
            return "No";
        }
        for(int loop=1;loop<=inputNum;loop*=4)
        {
            if(inputNum==loop)
            {
                return "Yes";
            }
        }
        return "No";

    }
}
