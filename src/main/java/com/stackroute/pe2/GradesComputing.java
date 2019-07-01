package com.stackroute.pe2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradesComputing {
   /* public static void main(String[] args) {
        Scanner sc = new Scanner();
        int numberStudent;
        System.out.println("Enter number of students :");
        numberStudent = sc.nextInt();
        int grades[] = new int[numberStudent];
        for (int loop = 0; loop < numberStudent; loop++) {
            System.out.println("Enter the grade for student " + loop);
            grades[loop] = sc.nextInt();
        }

        checkAverage(grades);
        checkMin(grades);
        checkMax(grades);
    }

*/


    public static double checkAverage(int grades[])
    {
        double sum=0;
        for(int loop=0;loop<grades.length;loop++)
        {
            sum=sum+grades[loop];
        }
        double average=sum/grades.length;

        return average;

    }
    public static int checkMin(int grades[])
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
    public static int checkMax(int grades[])
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


