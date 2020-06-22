import java.util.Scanner;
import java.util.Arrays;

	public class WordCount {
		public static void main(String[] args){
		
	Scanner s1 = new Scanner(System.in);
	System.out.print("Enter a sentence or paragraph:");
	String str = s1.nextLine();

	String words[] = str.toLowerCase().split("([,\\s?,@+])");
	int freqWords[] = new int[words.length];

	int prevCount = -1;
		for(int i = 0; i < words.length; i++) {
		int count = 1;
		for(int j = i+1; j < words.length; j++) {
		
		if (words[i].equals(words[j])) {
		count++;
		freqWords[j] = prevCount;
			}
		}
		if (freqWords[i]!=prevCount) {
			freqWords[i] = count;		
		}
	}
	System.out.println(Arrays.toString(words));
	System.out.println(Arrays.toString(freqWords));

	System.out.println("---------------------------");
	System.out.println("frequencies of words");

	for(int i = 0; i < freqWords.length; i++) {
		if( freqWords[i]!=prevCount){
			System.out.println("   "+words[i]+"     " +freqWords[i]);
		}
	}
	


	}
}
