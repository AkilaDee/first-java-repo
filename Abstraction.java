import java.util.Scanner;
abstract class Animal{


     public abstract void makeSound2() ;
    public abstract  void makeSound();

    public void sleep(){
       System.out.println("ZZZ");
   }


}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("woof");
    }
    public void makeSound2(){
        System.out.println("woofff");
    }

}

public class Abstraction{
    public static void main(String[] args){

        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();
        myDog.makeSound2();



    }


}