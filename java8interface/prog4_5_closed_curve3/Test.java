package  prog4_5_closed_curve3;

public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(3.0, 7.0),
								 new Circle(3)};
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.println(cc.computeArea());
			
		}
    
	}

}