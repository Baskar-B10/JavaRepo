package com.program.classes.abstraction;

// Define an interface named Shape
interface Shape1 {
    double calculateArea(); // Abstract method for
                            // calculating the area
}

// Implement the interface in a class named Circle
class Circle1 implements Shape1 {
    private double radius;

    // Constructor for Circle
    public Circle1(double radius) { this.radius = radius; }

    // Implementing the abstract method from the Shape
    // interface
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}

// Implement the interface in a class named Rectangle
class Rectangle1 implements Shape1 {
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle1(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method from the Shape
    // interface
    public double calculateArea() { return length * width; }
}

// OverloadingMain class to test the program
public class InterfaceExample {
    public static void main(String[] args)
    {
        // Creating instances of Circle and Rectangle
        Circle1 myCircle = new Circle1(5.0);
        Rectangle1 myRectangle = new Rectangle1(4.0, 6.0);

        // Calculating and printing the areas
        System.out.println("Area of Circle: "
                           + myCircle.calculateArea());
        System.out.println("Area of Rectangle: "
                           + myRectangle.calculateArea());
    }
}
