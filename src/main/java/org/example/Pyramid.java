package org.example;

public class Pyramid {

    private double baseLength;
    private double width;
    private double height;
    private double angle;

    public Pyramid(double baseLength, double width, double height, double angle) {
        this.baseLength = baseLength;
        this.width = width;
        this.height = height;
        this.angle = angle;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double surfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(baseLength / 2, 2) + Math.pow(height, 2));
        return baseLength * baseLength + 2 * baseLength * slantHeight;
    }

    public double volume() {
        return (1.0/3.0) * baseLength * width * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pyramid {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}