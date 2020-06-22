import java.util.*;
class StringReverse
{
  public static void main(String args[])
  {
    String str, rev="";
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the word to reverse");
    str = in.nextLine();
	System.out.println("-------------------------------------------");

    int length = str.length();

    for (int i = length - 1 ; i >= 0 ; i--)
      rev = rev + str.charAt(i);

    System.out.println("Reverse Word: " + rev);
  }
}