package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineEqualityCheckerUC2 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 4 points of line 1");
        Point p1 = new Point(input.nextDouble(), input.nextDouble());
        Point p2 = new Point(input.nextDouble(), input.nextDouble());
        Line l1 = new Line(p1, p2);

        System.out.println("Enter 4 points of line 2");
        Point p3 = new Point(input.nextDouble(), input.nextDouble());
        Point p4 = new Point(input.nextDouble(), input.nextDouble());
        Line l2 = new Line(p3, p4);

        System.out.println(l1.equals(l2) ? "Lines are equal" : "Lines are not equal");

        input.close();
    }
}
