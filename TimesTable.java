import java.util.Scanner;

public class TimesTable{
	public static void main (String[] args){

		System.out.println("Enter the number of inputs : ");
		Scanner readinput=new Scanner(System.in);
		int N =readinput.nextInt();
		
		int Multi=0;
		
		
		for(int i=1;i<=10;i++){
			Multi=N*i;
			System.out.println(N+ " x "+i +" = " +Multi );
			
		}

	}




}