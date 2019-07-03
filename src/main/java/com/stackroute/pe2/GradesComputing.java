package com.stackroute.pe2;
/*reads number of students and n grades as input (of int
between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
program shall check for valid input.*/


public class GradesComputing
{
    public static double checkAverage(int grades[])  //To check the average
    {
        double sum=0;
        for(int loop=0;loop<grades.length;loop++)
        {
            sum=sum+grades[loop];
        }
        double average=sum/grades.length;

        return average;

    }
    public static int checkMin(int grades[])       //To find the minimum number
    {
        int minValue = grades[0];
        for(int loop=1;loop<grades.length;loop++)
        {
            if(grades[loop] < minValue)
            {
                minValue = grades[loop];

            }
        }
        return minValue;
    }
    public static int checkMax(int grades[])        //To find the maximum number
    {
        int maxValue = grades[0];
        for(int loop=1;loop < grades.length;loop++){
            if(grades[loop] > maxValue){
                maxValue = grades[loop];
            }
        }
        return maxValue;

    }
}


