package com.functional;

import java.util.Scanner;

public class Array2D {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // input array column and row sizes
        System.out.print("Enter The Row Size : ");
        int arrayRowSize = scanner.nextInt();
        System.out.print("Enter The Column Size : ");
        int arrayColumnSize = scanner.nextInt();

        printArray(arrayRowSize, arrayColumnSize);   // function call
    }
    
    public static void printArray(int arrayRowSize, int arrayColumnSize) {
        int[][] twoDArray = new int[arrayRowSize][arrayColumnSize];

        // input array elements
        for (int i=0; i<arrayRowSize; i++) {
            for (int j=0; j<arrayColumnSize; j++) {
                System.out.print("Enter The Value at: "+i+ " "+j +" : ");
                twoDArray[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        // printing array
        for (int i=0; i<arrayRowSize; i++) {
            for (int j=0; j<arrayColumnSize; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}
