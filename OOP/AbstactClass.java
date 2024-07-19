import java.lang.*;
import java.util.*;

abstract class Shape
{
    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape
{
    double radius ;
    double perimeter()
    {
        return 2*Math.PI*radius;
    }

    double area()
    {
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape
{
    double length , width;
    double perimeter()
    {
        return 2*(length + width);
    }
    double area()
    {
        return length*width;
    }
}

public class AbstactClass
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        c1.radius = 10;
        System.out.println("Permeter of Circle :- " + c1.perimeter() );
        System.out.println("Area of Circle :- " + c1.area() + "\n" );


        Rectangle r1 = new Rectangle();
        r1.length = 5;
        r1.width = 5;
        System.out.println("Permeter of Rectangle:- " + r1.perimeter() );
        System.out.println("Area of Rectangle :- " + r1.area() );
    }

}