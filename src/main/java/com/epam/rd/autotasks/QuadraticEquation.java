package com.epam.rd.autotasks;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check the value of the discriminant
        if (discriminant > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(root1 + " " + root2);
        } else if (discriminant == 0) {
            // One real root
            double root = -b / (2.0 * a);
            System.out.println(root);
        } else {
            // No real roots
            System.out.println("no roots");
        }
    }
}




