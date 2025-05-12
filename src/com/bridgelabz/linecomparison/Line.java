package com.bridgelabz.linecomparison;

public class Line {

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
}
