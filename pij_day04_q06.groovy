Point p1 = new Point()
p1.x = 3.0
p1.y = 4.0
Point p2 = new Point()
p2.x = 9.0
p2.y = 12.0
Point given = new Point()
given.x = 12.0
given.y = 16.0

System.out.println()
System.out.println("point p1: " + p1.x + ", " + p1.y)
System.out.println("point p2: " + p2.x + ", " + p2.y)
System.out.println()
System.out.println("Distance from p1 to p2...p1.distanceTo(p2) = " + p1.distanceTo(p2))
System.out.println()
System.out.println("Distance from p1 to origin (0,0)...p1.distanceToOrigin() = " + p1.distanceToOrigin())
System.out.println()
System.out.println("Move p1 to given parameters x, y...p1.moveTo(30, 40)")
p1.moveTo(30.0, 40.0)
System.out.println("After move - p1: " + p1.x + ", " + p1.y)
System.out.println()
System.out.println("Move p1 to where given Point is...p1.moveTo(given)")
System.out.println("Given point: " + given.x + ", " + given.y)
p1.moveTo(given)
System.out.println("After move - p1: " + p1.x + ", " + p1.y)
System.out.println()
System.out.println("Return clone of p1...clone1 = p1.clone()")
Point clone1 = p1.clone()
System.out.println("clone1: " + clone1.x + ", " + clone1.y)
System.out.println()
System.out.println("Return clone of p1 with opposite co-ordinates (x -1)...cloneMinus = clone1.opposite()")
Point cloneMinus = clone1.opposite()
System.out.println("cloneMinus: " + cloneMinus.x + ", " + cloneMinus.y)
System.out.println()

class Point {
	double x, y

	// Calculates the distance to another point.
	double distanceTo(Point point) {
		return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2))
	}

	// Calculates the distance to the origin. Calls the 1st method.
	// Assume origin means 0,0
	double distanceToOrigin() {
		Point origin = new Point()
			origin.x = 0
			origin.y = 0
		return distanceTo(origin)
	}

	// Changes the coordinates of this point to be the given parameters x and y.
	void moveTo(double x, double y) {
		this.x = x
		this.y = y
		return
	}

	// Changes the coordinates of this point to move where the given point is.
	void moveTo(Point point) {
		this.x = point.x
		this.y = point.y
		return
	}

	// Returns a copy of the current point with the same coordinates.
	Point clone() {
		Point clonedPoint = new Point()
		clonedPoint.x = x
		clonedPoint.y = y
		return clonedPoint
	}

	// Returns a copy of the current point with the coordinates multiplied by −1.
	Point opposite() {
		Point oppositePoint = new Point()
		oppositePoint.x = -x
		oppositePoint.y = -y
		return oppositePoint
	}
}

