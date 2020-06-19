import java.util.Scanner;

public class Marks{
	public static void main (String[] args){

		System.out.println("Enter the marks  : ");
		Scanner readinput=new Scanner(System.in);
		int N =readinput.nextInt();
		
		if(N>=75){
			System.out.println("Grade :A");

		}else if(N>=50){
			System.out.println("Grade :B");
		
		}else if(N<50){
			System.out.println("Grade :F");
		
		}

			
	}




}