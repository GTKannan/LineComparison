package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparatorUC3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Line 1 input
		System.out.println("Enter x1, y1, x2, y2 for Line 1:");
		Point a = new Point(sc.nextDouble(), sc.nextDouble());
		Point b = new Point(sc.nextDouble(), sc.nextDouble());
		Line line1 = new Line(a, b);

		// Line 2 input
		System.out.println("Enter x3, y3, x4, y4 for Line 2:");
		Point c = new Point(sc.nextDouble(), sc.nextDouble());
		Point d = new Point(sc.nextDouble(), sc.nextDouble());
		Line line2 = new Line(c, d);

		// Compare lines
		int result = line1.compareTo(line2);

		if (result == 0)
			System.out.println("Both lines are equal in length.");
		else if (result < 0)
			System.out.println("Line 1 is shorter than Line 2.");
		else
			System.out.println("Line 1 is longer than Line 2.");

		sc.close();
	}

}
