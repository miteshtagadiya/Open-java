package GEOFIGURES;

public class Rectangle extends TwoDFigure {

    private double width;
    private double length;

    Rectangle(){}

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setLengthUnit(String lengthUnit) {
        super.setLengthUnit(lengthUnit);
    }

    @Override
    public String getLengthUnit() {
        return super.getLengthUnit();
    }

    @Override
    double calculatePerimeter() {
        return 2 * (this.getWidth()+this.getLength());
    }

    @Override
    double calculateArea() {
        return this.getWidth() * this.getLength();
    }

    @Override
    void displayFigureData() {
        super.setShape("Rectangle");
        System.out.println(super.getShape());
        System.out.println("Perimeter is: " + this.calculatePerimeter() + " " + "Area is: " + this.calculateArea() + " Width is: "+ this.getWidth() + " Length is: "+ this.getLength());
    }
}
