package calculator;

public class SimpleCalculator{
	public int interestCalculation(int payment, int rate){
		int interestAmount = payment * rate /100;
		return interestAmount;
	}
}