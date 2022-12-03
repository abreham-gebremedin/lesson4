package prog4_4_closed_curve2;

final public class Rectangle extends ClosedCurve implements Polygon {

    final private double width;
    final private double height;
//  Constructor of immutable class
//	 Parameterized constructor
    public Rectangle(double width,double lenght) {
        this.width = width;
        this.height = lenght;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
@Override
    public String computeArea()
    {
        return "The area of this Rectangle is "+ width * height;
    }

@Override
public int getNumberOfSides() {
	// TODO Auto-generated method stub
	return 4;
}

@Override
public double computePerimeter() {
	// TODO Auto-generated method stub
	
	return 2*height+20*width;
}

}