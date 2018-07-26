package GEOFIGURES;

import java.util.Scanner;

public class FigureCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Enter Your Choice:");
            System.out.println("Please Choose Either 1 or 2.");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");

            ch = sc.nextInt();


            switch (ch) {

                case 1: {

                    double radius;
                    String unit;
                    Circle c;
                    System.out.println("Enter Radius: ");
                    radius = sc.nextDouble();
                    if (radius < 0) {
                        do {
                            System.out.println("Enter Radius: ");
                            radius = sc.nextDouble();
                        } while (radius > 0);
                    }

                    c = new Circle(radius);

                    do {
                        System.out.println("Enter Measurement Unit: ");
                        System.out.println("in for Inch");
                        System.out.println("ft for Feet");
                        System.out.println("cm for Centimeter");
                        System.out.println("m for Meter");
                        unit = sc.next();
                        c.setLengthUnit(unit);
                    } while (unit == "in" || unit == "ft" || unit == "cm" || unit == "m");

                    c.displayFigureData();

                }
                break;

                case 2: {
                    double width;
                    double length;
                    String unit;
                    System.out.println("Enter Width: ");
                    width = sc.nextDouble();
                    System.out.println("Enter Length");
                    length = sc.nextDouble();

                    if (width < 0 || length < 0) {
                        do {
                            System.out.println("Enter Width: ");
                            width = sc.nextDouble();
                            System.out.println("Enter Length");
                            length = sc.nextDouble();
                        } while (width > 0 || length > 0);
                    }
                    Rectangle r = new Rectangle(width, length);

                    System.out.println("Enter Measurement Unit: ");
                    System.out.println("in for Inch");
                    System.out.println("ft for Feet");
                    System.out.println("cm for Centimeter");
                    System.out.println("m for Meter");
                    unit = sc.next();
                    if (unit != "in" || unit != "ft" || unit != "cm" || unit != "m") ;
                    {
                        do {
                            System.out.println("Enter Measurement Unit: ");
                            System.out.println("in for Inch");
                            System.out.println("ft for Feet");
                            System.out.println("cm for Centimeter");
                            System.out.println("m for Meter");
                            unit = sc.next();
                            r.setLengthUnit(unit);
                        } while (unit == "in" || unit == "ft" || unit == "cm" || unit == "m");
                    }
                    r.displayFigureData();
                }
                break;
            }


        } while (ch == 1 || ch == 2);
    }
}