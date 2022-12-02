package prog4_2_closed_curve;

final public class Rectangle extends ClosedCurve {

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

}