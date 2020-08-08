import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String[] args){
		Scanner readinput= new Scanner(System.in);

		while(true){
			try{
				System.out.println("Enter your number : ");
				int userinput = readinput.nextInt();
				
				switch(userinput){
					case 1:
						int a=1/0;
						break;			
					case 2:
						String b=null;
						System.out.println(b.length());
						break;
					case 3:
						String c="abc";
						int d=Integer.parseInt(c);
						break;
					case 4:
						int e[]=new int[1];
						e[10]=1;
						break;
					case 5:
						String f="A";
						System.out.println(f.charAt(10));
						break;
					case 6:
						throw new MyException("My Exception");
					case 7:
						System.exit(0);

				
				}
			}catch(ArithmeticException e){
				System.out.println("ArithmeticException occured! " + e + "/n");
			}catch(NullPointerException e){
				System.out.println("NullPointerException occured! " + e + "/n");
			}catch(NumberFormatException e){
				System.out.println("NumberFormatException occured! " + e + "/n");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ArrayIndexOutOfBoundsException occured! " + e + "/n");
			}catch(MyException e){
				System.out.println("MyException occured! " + e + "/n");
			}
		}

	}
}
class MyException extends Exception{
	public MyException(String message){
		super(message);
	}
}
