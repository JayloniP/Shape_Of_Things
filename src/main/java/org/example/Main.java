package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Sphere sphere = new Sphere(2.0);
        Cone cone = new Cone(1.0, 4.0);
        RectangularPrism rectangularPrism = new RectangularPrism(2.0, 3.0, 4.0);
        Pyramid pyramid = new Pyramid(5.0, 6.0, 5.0, Math.toRadians(60)); // Angle in radians

        System.out.println(sphere);
        System.out.println(cone);
        System.out.println(rectangularPrism);
        System.out.println(pyramid);
    }
}

