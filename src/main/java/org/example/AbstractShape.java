package org.example;

public abstract class AbstractShape implements ThreeDimensionalShape {
    protected double size;

    public AbstractShape(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}