package com.bridgelabz.linecomparison;
import java.util.Scanner;

class Line implements Comparable<Line>{

    Point p1, p2;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Simplified equality check
    public boolean equals(Object obj) {
        if (!(obj instanceof Line)) return false;
        Line l = (Line) obj;
        return (p1.equals(l.p1) && p2.equals(l.p2)) || (p1.equals(l.p2) && p2.equals(l.p1));
    }

    // Calculate the length of the line
    public double length() {
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Compare two lines based on their length
    @Override
    public int compareTo(Line other) {
        return Double.compare(this.length(), other.length());
    }

}

class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point))
            return false;
        Point p = (Point) obj;
        return x == p.x && y == p.y;
    }
}

public class LineComparison {
    public double lineLengthCalculator(double x1,double x2,double y1,double y2) {
        // Calculate the length of the line
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return length;
    }

    public static void main(String[] args) {
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

        // code to check line equality (UC2)
        System.out.println("Enter 4 points of line 1");
        Point p1 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point p2 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Line l1 = new Line(p1, p2);

        System.out.println("Enter 4 points of line 2");
        Point p3 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point p4 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Line l2 = new Line(p3, p4);

        // Check equality
        if (l1.equals(l2)) {
            System.out.println("Lines are exactly equal.");
        } else {
            // Compare lengths
            int result = l1.compareTo(l2);
            if (result == 0)
                System.out.println("Lines are of equal length but not same endpoints.");
            else if (result > 0)
                System.out.println("Line 1 is longer than Line 2.");
            else
                System.out.println("Line 1 is shorter than Line 2.");
        }

        scanner.close();
    }
}
