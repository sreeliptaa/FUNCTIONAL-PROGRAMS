package com.functional;
import java.util.Scanner;
public class SumofThree {
    public static void main(String[] args) {

            int[] arr = {1, 2, 3, 5, 7, -5, 6, -1, -2, -3, 4};
            int sumOfThree, count = 0;

            // logic and calculations
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    for (int k = j + 1; k < arr.length; k++) {
                        sumOfThree = arr[i] + arr[j] + arr[k];
                        if (sumOfThree == 0) {
                            count++;
                            System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k] + " = " + 0);
                        }
                    }
                }
            }
            System.out.println("Triplets Count: " + count);
    }
}

