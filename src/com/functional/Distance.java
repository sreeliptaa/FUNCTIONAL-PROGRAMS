package com.functional;
import java.util.Scanner;
public class Distance {
      // Function to calculate the value of distance
    static void calculate(int x, int y) {
        double result = (Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2))));
		System.out.println("The Euclidean distance is: " + result)
    }

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Value for x coordinate");
            int x = s.nextInt();
            System.out.println("Enter Value for y coordinate ");
            int y = s.nextInt();
            calculate(x, y);
            s.close();
        } catch (Exception e) {
            System.out.println("Enter Integer Only");
        }
    }
}
