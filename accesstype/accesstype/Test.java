package  accesstype;

public class Test {
	
	public static void main(String[] args) {

//		down casting 
		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Circle(3)};
//		object[0] trianglr type
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.println(cc.computeArea());
			
		}
    
	}

}