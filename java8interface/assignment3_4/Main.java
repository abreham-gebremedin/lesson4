package assignment3_4;

/*Create a fourth class Main that will, in its main method, test these three figure classes as 
follows: It will create one instance of each (you can make your own choice for the 
dimensions of your figures) and then print to the console the area of each. Typical output 
would be: 
       Area of Triangle is 34.75
       Area of Rectangle is 36.0
       Area of Circle is 58.57
*/

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(6.0, 11.0);
        System.out.println("Area of Triangle is " + triangle.computeArea());
 

        Rectangle rectangle = new Rectangle(6.0, 2.0);
        System.out.println("Area of Rectangle is " + rectangle.computeArea());

        Circle circle = new Circle(3.0);
        System.out.print("Area of Circle is ");
        System.out.printf("%.2f", circle.computeArea());
    }
}