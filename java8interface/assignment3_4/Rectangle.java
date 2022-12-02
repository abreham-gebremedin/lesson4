package assignment3_4;

final public class Rectangle {

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

    public double computeArea()
    {
        return width * height;
    }

}