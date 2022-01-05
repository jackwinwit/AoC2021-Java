package com.mycompany.adventofcode21;

import java.io.*;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        int i = 0;
        int previousline = 0;
        int increases = 0;
        
        try {
            File data = new File("day1testdata.txt");
            Scanner search = new Scanner(data);
            
            while (search.hasNextLine()) {
                String lineinput = search.nextLine();
                int line = Integer.parseInt(lineinput);
                if (i == 0) {
                    System.out.println(line + " (N/A - no previous measurement)");
                    previousline = line;
                    i++;
                } else {
                    if (previousline > line){
                        System.out.println(line + " (decreased)");
                        previousline = line;
                    } else if (previousline < line) {
                        System.out.println(line + " (increased)");
                        previousline = line;
                        increases++;
                    } else {
                        System.out.println(line + " (no change)");
                    }
                }
            }
            System.out.println("There are " + increases + " measurements that are larger than the previous measurement.");
        } catch (FileNotFoundException  e) {
            System.out.println("ERROR: " + e);
        }
    }
}