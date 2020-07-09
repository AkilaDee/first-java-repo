public class MagicMain{

	public static void main(String[] args){
		MathsMagic mathsMagi = new MathsMagic();

		System.out.println(mathsMagi.doMagic(10,5));
		System.out.println(mathsMagi.doMagic(5.5,4.5));

	}
}

class MathsMagic {
	public int doMagic(int n1, int n2){
		return n1+n2;
	}


	public double doMagic(double n1, double n2){
		return n1*n2;
	}

}