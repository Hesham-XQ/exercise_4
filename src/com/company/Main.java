package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rn = new Random();
        int arrayLength = rn.nextInt(11) + 10;
        int [] x = new int[arrayLength];

        System.out.println("*Hint : The number of elements in the array and the items inside the array are generated randomly.");
        System.out.println("The Array :-");

        for (int i = 0; i < x.length ; i++) {
            int range = rn.nextInt(1501) + 50;
            x[i] = range;
            System.out.println(x[i] + " ");
        }
        int n = arrayLength;

        int y[] = new int[n];
        int i, j;

        for (i = 0, j = n - 1; i < n; i++, j--) {
            y[i] = x[j];
        }

        System.out.println("Inverse order is: ");

        for (int b = 0; b < x.length; b++) {
            System.out.println(y[b]);
        }
    }

    private void inverseArray (int n) {

    }
}
