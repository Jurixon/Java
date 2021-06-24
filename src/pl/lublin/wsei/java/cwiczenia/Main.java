package pl.lublin.wsei.java.cwiczenia;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String leftPad(String aText, char aChar, int aWidth){
        String res = aText;
        for(int i = 0; i < aWidth - aText.length(); i++)
            res = aChar + res;
        return res;
    }

    int[] liczby = new int[30];
    Random rnd = new Random();

    for(int i = 0; i < 30; i++){
        liczby[i] = rnd.nextInt();
    }
    int mx = Integer.MIN_VALUE;
    int mn = Integer.MAX_VALUE;
    long avg = 0;
    for(int l : liczby)
    {
        System.out.println(l);
        if(l < mn) mn = 1;
        if(l > mx) mx = 1;
        avg += 1;
    }
    System.out.printf("MIN = %d, MAX = %d, AVG = %f ", mn, mx, (float)avg / liczby.length);
    public static void main(String[] args) {
        leftPad("hi", '5', 6);


    }
}