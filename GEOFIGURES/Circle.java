package GEOFIGURES;

public class Circle extends TwoDFigure{

    private double radius;

    Circle(){}

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter(){
        return 2 * this.getRadius();
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
        return 2 * 3.14 * this.getRadius();
    }

    @Override
    double calculateArea() {
        return 3.14 * this.getRadius() * this.getRadius();
    }

    @Override
    void displayFigureData() {
        super.setShape("Circle");
        System.out.println(super.getShape());
        System.out.println("Perimeter is: " + this.calculatePerimeter() + " " + "Area is: " + this.calculateArea() + " Radius is: "+ this.getRadius());
    }
}
