package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {

    public double lineLengthCalculator(double x1,double x2,double y1,double y2) {
        // Calculate the length of the line
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return length;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

        Scanner scanner = new Scanner(System.in);

        // Get coordinates of first point
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        // Get coordinates of second point
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Creating object for class and calling method
        LineComparison calculate =new LineComparison();
        double length=calculate.lineLengthCalculator(x1,x2,y1,y2);

        // Display the result
        System.out.printf("Length of the line: %.2f\n", length);

        scanner.close();
    }
}
