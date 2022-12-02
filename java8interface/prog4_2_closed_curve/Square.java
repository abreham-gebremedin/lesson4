package  prog4_2_closed_curve;

public final class Square extends ClosedCurve {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public String computeArea() {
		return "The area of this Square is " + side * side;
	}


}
