package  prog4_5_closed_curve3;

public final class Square extends ClosedCurve implements Polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public String computeArea() {
		return "The area of this Square is " + side * side;
	}
	@Override
	public double[] getArrayOfSides() {
		// TODO Auto-generated method stub
		return new double[] {side,side,side,side};
	}
 


}
