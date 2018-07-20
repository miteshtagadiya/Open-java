package Shapes;

public class Ellipse implements Shape{
    private double MajorRadius;
    private double MinorRadius;

    public double getMajorRadius() {
        return MajorRadius;
    }

    public void setMajorRadius(double majorRadius) {
        MajorRadius = majorRadius;
    }

    public double getMinorRadius() {
        return MinorRadius;
    }

    public void setMinorRadius(double minorRadius) {
        MinorRadius = minorRadius;
    }

    @Override
    public double getPetimeter() {
        double root = (this.getMajorRadius()*this.getMajorRadius()) +(this.getMinorRadius()+this.getMinorRadius());
        return 2*3.14*Math.sqrt(root/2);
    }

    @Override
    public double getArea() {
        return 3.14*this.getMinorRadius()*this.getMajorRadius();
    }

    @Override
    public String toString() {
        return "Ellipse: " + "Perimeter is: " + this.getPetimeter() + " Area is: " + this.getArea();
    }
}
