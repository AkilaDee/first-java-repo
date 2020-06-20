import java.util.Scanner;

public class Odd_or_Even{
	public static void main (String[] args){

		System.out.println("Enter the number of inputs : ");
		Scanner readinput=new Scanner(System.in);
		int N =readinput.nextInt();
		
		int OddCount=0;
		int EvenCount=0;
		
		for(int i=1;i<N+1;i++){
			System.out.println("Enter the input number "+i);
			
			int temp=readinput.nextInt();

			if(temp%2==0){
				EvenCount++;
			
			}else{
				OddCount++;
			}

		}

		System.out.println("Number of Even Numbers : "+EvenCount);
		System.out.println("Number of Odd Numbers : "+OddCount);
	}




}