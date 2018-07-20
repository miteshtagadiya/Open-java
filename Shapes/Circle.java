package Shapes;

public class Circle extends Ellipse {
    private double radius;

    Circle(){
        super();
        super.setMajorRadius(this.getRadius());
        super.setMinorRadius(this.getRadius());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * 3.14 * this.getRadius();
    }

    @Override
    public double getArea() {
        return 3.14 * this.getRadius() * this.getRadius();
    }

    @Override
    public String toString() {
        return "Circle: " + "Circumference is: " + this.getCircumference() + " Area is: " + this.getArea();
    }
}
