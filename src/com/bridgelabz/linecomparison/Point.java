package com.bridgelabz.linecomparison;

public class Point {
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
