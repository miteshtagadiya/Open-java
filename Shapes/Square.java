package Shapes;

public class Square extends SquareShape {
    private double sideLength;


    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double getArea() {
        return 2 * this.getSideLength();
    }

    @Override
    double getPetimeter() {
        return 4 * getSideLength();
    }

    @Override
    public String toString() {
        return "Square: " + "Perimeter is: " + this.getPetimeter() + " Area is: " + this.getArea();
    }
}
