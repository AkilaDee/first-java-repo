public abstract class Shape {
    protected String color = "Magenta";
    protected boolean filled = true;

    protected Shape(){}
    protected Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public abstract double calcArea();
    public abstract String toString();

}
