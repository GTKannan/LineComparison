package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class UC4 {
	    public static void main(String[] args) {
	    	
	        Scanner s = new Scanner(System.in);

	        // Input for Line 1
	        System.out.println("Enter x1 y1 x2 y2 for Line 1:");
	        Point a = new Point(s.nextDouble(), s.nextDouble());
	        Point b = new Point(s.nextDouble(), s.nextDouble());
	        Line line1 = new Line(a, b);

	        // Input for Line 2
	        System.out.println("Enter x3 y3 x4 y4 for Line 2:");
	        Point c = new Point(s.nextDouble(), s.nextDouble());
	        Point d = new Point(s.nextDouble(), s.nextDouble());
	        Line line2 = new Line(c, d);

	        // Check equality
	        if (line1.equals(line2)) {
	            System.out.println("Lines are exactly equal.");
	        } else {
	            // Compare lengths
	            int result = line1.compareTo(line2);
	            if (result == 0)
	                System.out.println("Lines are of equal length but not same endpoints.");
	            else if (result > 0)
	                System.out.println("Line 1 is longer than Line 2.");
	            else
	                System.out.println("Line 1 is shorter than Line 2.");
	        }

	        s.close();
	    }
	}
