import java.util.*;

class Mycalc 
{

	double a,b;
	
	public double add()
	{
		double c= a+b;
		return c;
	}
	
	public double substract()
	{
		double c= a-b;
		return c;
	}
	
	public double divide()
	{
		double c= a/b;
		return c;
	}
	
	public double multiply()
	{
		double c= a*b;
		return c;
	}
	
}
class Calc
{
  public static void main(String args[])
  {
	  double x,y;
	  int z;
	  Scanner in = new Scanner(System.in);
	  
	  System.out.print("Enter the 2 numbers : ");
	  x = in.nextDouble();
	  y = in.nextDouble();
	  System.out.println("\n");
	  
	  Mycalc C=new Mycalc();
	  
	  C.a=x;
	  C.b=y;
	  
	  System.out.println("What is the operation you want to perform?");
	  System.out.println("1. Addition");
	  System.out.println("2. Substraction");
	  System.out.println("3. Division");
	  System.out.println("4. Multiplication");
	  System.out.println("\n");
	  z= in.nextInt();
	  System.out.println("\n");
	  
	  if(z==1)
	  {
		System.out.println(x+" + " +y+ " = " +C.add());
	  }
	  
	  else if(z==2)
	  {
		System.out.println(x+" - " +y+ " = " +C.substract());
	  }
	  
	  else if(z==3)
	  {
		System.out.println(x+" / " +y+ " = " +C.divide());
	  }
	  
	  else if(z==4)
	  {
		System.out.println(x+" * " +y+ " = " +C.multiply());
	  }
	  
	  else
	  {
		System.out.println("Wrong input");
	  }
	  
  }
}