package taxCalc;
import calculator.*;

public class TaxCalculation{
	public static void main (String args[]){
		calculator.SimpleCalculator interestAmount = new calculator.SimpleCalculator();
		int finalOutput = interestAmount.interestCalculation(20000,8);
		System.out.println("Interest rate to be paid " + finalOutput );
	}
}