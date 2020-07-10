public class PatternMain{
	public static void main(String[] args){
		PatternGen pattern = new PatternGen();
		
		pattern.generatePattern();
		pattern.generatePattern('k');
		pattern.generatePattern(4);
		pattern.generatePattern(7, 't');
		
	}
}

class PatternGen {
	public void generatePattern(int num,char c){
		for(int i=1; i<=num; i++){
			for(int j=1;j<=i;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}


	public void generatePattern(int num){
		generatePattern(num,'+');
	}

	public void generatePattern(char c){
		generatePattern(5,c);
	}

	public void generatePattern(){
		generatePattern(5,'*');
	}
}