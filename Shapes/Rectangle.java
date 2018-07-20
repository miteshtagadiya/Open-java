package Shapes;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.getHeight() * this.getWidth();
    }

    @Override
    public double getPetimeter() {
        return 2 * (this.getWidth() + this.getHeight());
    }

    @Override
    public String toString() {
        return "Rectangle: " + "Perimeter is: " + this.getPetimeter() + " Area is: " + this.getArea();
    }
}
