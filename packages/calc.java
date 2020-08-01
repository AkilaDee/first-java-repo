package calc;
import arithmeticCalculator.*;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args){
        SimpleArithmeticCalculator cal1=new SimpleArithmeticCalculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int num1=sc.nextInt();
        System.out.println("Enter the second Number");
        int num2=sc.nextInt();
        int sum=cal1.add(num1,num2);
        int sub=cal1.subtract(num1,num2);
        int multi=cal1.multiplication(num1,num2);
        double division=cal1.division(num1,num2);
        System.out.println("Addition = " +sum);
        System.out.println("Substraction = " +sub);
        System.out.println("Division = " +division);
        System.out.println("Multiplication = " +multi);

    }
}
