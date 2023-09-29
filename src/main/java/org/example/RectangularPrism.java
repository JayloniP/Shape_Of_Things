package org.example;

public class RectangularPrism {

    private double length;
    private double width;
    private double height;

    public RectangularPrism(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double volume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RectangularPrism {");
        sb.append("length=").append(length);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}