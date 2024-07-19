import java.lang.*;
import java.util.*;


class circle {
    public double radius;

    // constructors
    circle()
    {
        radius = 1;
    }

    circle(double r) {
        radius = r;
    }

    // methos --> behavior
    public double Area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumfrence() {
        return perimeter();
    }
}

class Rectangle {
    public double length;
    public double width;

    // constructor
    Rectangle(double l) {
        length = l;
        width = 1;
    }

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double Area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
    public boolean isSquare()
    {
        if(length == width)
            return true;
        else
            return false;
    }
}

class Cylinder extends circle
{

    private double height;

    public Cylinder()
    {
        radius = 1;
        height = 1;
    }

    public Cylinder(double r, double h)
    {
        radius = r;
        height = h;
    }

    public double volume()
    {
        return Area()*height;
    }
}



public class Object {
    public static void main(String[] args)
    {
        circle c1 = new circle(8);
        System.out.println("Area of C1 = " + c1.Area());
        System.out.println("Circumfrence of C1 = " + c1.circumfrence());

        System.out.println("\n");
        circle c2 = new circle(10);
        System.out.println("Area of C2 = " + c2.Area());
        System.out.println("Circumfrence of C2 = " + c2.circumfrence());

        System.out.println("\n");
        Rectangle r1 = new Rectangle(10);
        System.out.println("Area of r1 = " + r1.Area());
        System.out.println("Perimeter of r1 = " + r1.perimeter());

        System.out.println("\n");
        Rectangle r2 = new Rectangle(10, 15);
        System.out.println("Area of r2 = " + r2.Area());
        System.out.println("Perimeter of r2 = " + r2.perimeter());

        System.out.println("\n");
        Cylinder cy1 = new Cylinder(12, 10);
        System.out.println("Volume of Cylinder = " + cy1.volume());

    }

}