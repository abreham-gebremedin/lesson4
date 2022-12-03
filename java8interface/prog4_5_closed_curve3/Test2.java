package prog4_5_closed_curve3;

public class Test2 {
 
		public static void main(String[] args) {

			Polygon[] objects = {new Triangle(4,5,6),
									 new Square(3),
									 new Rectangle(3.0, 7.0)};
			//compute areas
			for(Polygon cc : objects) {
				System.out.println("For "+ cc.getClass().getName() +" Class" );
 				System.out.println("Perimetere "+cc.computePerimeter());
				
			}
	    
		}

}
