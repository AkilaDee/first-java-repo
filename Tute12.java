public class Tute12 {
    public static void main(String[] args) {
        
        Circle c1 = new Circle("red", true, 7.2);
        System.out.println("\n" + c1.toString());

        Rectangle r1 = new Rectangle("red", true, 5.2, 7.5);
        System.out.println("\n" + r1.toString());
      
        Triangle t1 = new Triangle("red", true, 3.3, 6.6);
        System.out.println("\n" + t1.toString());
    }
}