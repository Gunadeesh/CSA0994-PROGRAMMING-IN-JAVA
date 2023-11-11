import java.lang.Math;

class Triangle {
    // sides of the triangle
    double side1, side2, side3;

    // constructor with no parameters
    public Triangle() {
        // default sides
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }

    // method to calculate the area of the triangle
    double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // method to calculate the perimeter of the triangle
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class question1assignment3 {
    public static void main(String[] args) {
        // Create an instance of the Triangle class
        Triangle myTriangle = new Triangle();

        // Calculate and print the area
        double area = myTriangle.calculateArea();
        System.out.println("Area of the triangle: " + area);

        // Calculate and print the perimeter
        double perimeter = myTriangle.calculatePerimeter();
        System.out.println("Perimeter of the triangle: " + perimeter);
    }
}
