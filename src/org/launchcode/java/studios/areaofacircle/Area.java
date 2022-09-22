package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = in.nextDouble();
        while (radius <0) {
            System.err.println("Radius must be non-negative.");
            System.out.print(1);
            radius = in.nextDouble();
        }
        System.out.println("The area of a circle of radius " + radius + " is " + Circle.getArea(radius));
    }
}
