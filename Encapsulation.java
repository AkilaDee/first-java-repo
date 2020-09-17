import java.util.Scanner;
 class  Student{

    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

     public int getAge(){
         return age;
     }
     public void setAge(int age){
         this.age=age;
     }
}
public class Encapsulation{
    public static void main(String[] args){
        Student s=new Student();
        s.setName("max");
        s.setAge(20);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}