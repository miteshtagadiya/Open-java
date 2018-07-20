package Shapes;

import java.util.Scanner;

//In the Object Hierarchy There One Interface, and 4 other class are created.
//Interface is Shape
//Ellipse and Rectangle are implements Shape interface
//Circle extends Ellipse
//Square extends SquareShape abstract class
//In all the classes there are one or many overridden methods but one common overridden method is toString()
//One Abstract Class SquareShape

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double major,minor,radius,height,width,sidelength;

        System.out.println("Ellipse: ");
        System.out.println("Enter Major Radius: ");
        major = sc.nextDouble();
        System.out.println("Enter Minor Radius: ");
        minor = sc.nextDouble();
        Ellipse e = new Ellipse();
        e.setMajorRadius(major);
        e.setMinorRadius(minor);
        System.out.println(e.toString());

        System.out.println("Circle: ");
        System.out.println("Enter Radius: ");
        radius = sc.nextDouble();
        Circle c = new Circle();
        c.setRadius(radius);
        System.out.println(c.toString());

        System.out.println("Rectangle: ");
        System.out.println("Enter Height: ");
        height = sc.nextDouble();
        System.out.println("Enter Width: ");
        width = sc.nextDouble();
        Rectangle r = new Rectangle();
        r.setHeight(height);
        r.setWidth(width);
        System.out.println(r.toString());

        System.out.println("Square: ");
        System.out.println("Enter SideLength: ");
        sidelength = sc.nextDouble();
        Square s = new Square();
        s.setSideLength(sidelength);
        System.out.println(s.toString());


    }
}
