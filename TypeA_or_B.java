import java.util.Scanner;

public class TypeA_or_B{
	public static void main (String[] args){

		System.out.println("Enter the number  : ");
		Scanner readinput=new Scanner(System.in);
		int N =readinput.nextInt();
		
		if(N%25==0 && N%100!=0){
			
			System.out.println("Type A");
		}		

		
		if(N%4==0 && N%128!=0){
			
			System.out.println("Type B");
		}
			

			
	}




}