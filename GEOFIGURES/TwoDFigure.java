package GEOFIGURES;

abstract class TwoDFigure {
    public byte dimension;
    protected String shape;
    protected String lengthUnit;

    TwoDFigure(){}

    public byte getDimension() {
        return dimension;
    }

    public void setDimension(byte dimension) {
        this.dimension = dimension;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getLengthUnit() {
        return lengthUnit;
    }

    public void setLengthUnit(String lengthUnit) {
        this.lengthUnit = lengthUnit;
    }

    abstract double calculatePerimeter();

    abstract double calculateArea();

    abstract void displayFigureData();
}
