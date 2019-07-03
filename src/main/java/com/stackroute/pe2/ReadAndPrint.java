package com.stackroute.pe2;

/*read the content of a text file, convert the content in upper case
and print the same in console along with the length of the file.*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadAndPrint
{
    public static long readPrint(String path) throws Exception
    {
        File file = new File(path);    //Get the file path

        BufferedReader br = new BufferedReader(new FileReader(file));

        String store;
        while ((store = br.readLine()) != null)       //Read till the end of file
            System.out.println(store.toUpperCase());

        return file.length();
    }
}
