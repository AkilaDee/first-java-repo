


abstract class Shape {
    public abstract double getArea();
}


class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return (this.length * this.width);
    }
}


class Triangle extends Shape {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return (this.base * this.height * 0.5);
    }
}


class Circle extends Shape {
    double PI = 3.14;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (PI * this.radius * this.radius);
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        
        Rectangle R1 = new Rectangle(15.5, 10.1);
        System.out.println( R1.getArea());

      
        Triangle T1 = new Triangle(10.5, 5.5);
        System.out.println(T1.getArea());

        
        Circle C1 = new Circle(7.7);
        System.out.println( C1.getArea());
    }
}