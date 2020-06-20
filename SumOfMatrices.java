public class SumOfMatrices {
	public static void main(String[] args) {

		int first[][]={{1,2,3},{4,5,6},{7,8,9}};
		int second[][]={{2,3,4},{5,6,7},{8,9,1}};
	
	         int sum[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i][j] = first[i][j] + second[i][j];
				System.out.println("Sum of two matrices :");
				System.out.println();
				System.out.print(sum[i][j]+" ");    
			}    
			System.out.println();   
		}    
	}
}  

	
UCSC offers Computer Science and Software Engineering education under the Bachelor of
Computer Science and Information Systems under Bachelor of Information Systems intakes
through the University Grants Commission as internal students such as Bachelor of Science in
Computer Science, Bachelor of Science in Information Systems, Bachelor of Science Honours
in Computer Science, Bachelor of Science Honours in Software Engineering, Bachelor of
Science Honours in Information Systems