package  prog4_2_closed_curve;

public final class Circle extends ClosedCurve {
	private final double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public String computeArea() {
		return "The area of this Circle is"+(Math.PI * radius * radius);
	}
}
