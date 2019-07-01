package com.stackroute.pe2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadAndPrint {
    public static long readPrint(String path) throws Exception{
        File file = new File(path);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String store;
        while ((store = br.readLine()) != null)
            System.out.println(store.toUpperCase());

        return file.length();
    }
}
