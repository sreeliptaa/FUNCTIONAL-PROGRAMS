package com.functional;
import java.util.Scanner;
public class Distance {
      // Function to calculate the value of distance
    static void calculate(int x, int y) {
        System.out.println("Distance is " + Math.pow((x * x + y * y), 0.5));
    }

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Value for x");
            int x = s.nextInt();
            System.out.println("Enter Value for y ");
            int y = s.nextInt();
            calculate(x, y);
            s.close();
        } catch (Exception e) {
            System.out.println("Enter Integer Only");
        }
    }
}
