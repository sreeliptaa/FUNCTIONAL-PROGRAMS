package com.functional;

import java.util.Scanner;

public class Quadractic {
    // Function to find the roots of equation

    static void roots(int a, int b, int c) {
        // calculating delta value
        double delta = Math.abs(b * b - 4 * a * c); 
        System.out.println("Root 1 of x ="+(-b+delta)/(2*a));
        System.out.println("Root 2 of x ="+(-b-delta)/(2*a));

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      
            System.out.println("Enter Value of a ");
            int a = s.nextInt();
            System.out.println("Enter Value of b");
            int b = s.nextInt();
            System.out.println("Enter Value c");
            int c = s.nextInt();
            roots(a, b, c); 
        }
        s.close();
    }
}
