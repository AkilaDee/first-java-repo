public class Circle extends Shape {
    public double radius;

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color,boolean filled,double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double calcArea() {
        return this.radius*this.radius*Math.PI;
    }

    public String toString() {
        return "Circle color is " + super.color + " The filled is " + super.filled
                + " and area is " + calcArea();
    }
}