
public class SimpleCalculator {
	private double firstNumber;
	private double secondNumber;

	public void setFirstNumber(double Num1) {
		this.firstNumber = Num1;
	}

	public void setSecondNumber(double Num2) {
		this.secondNumber = Num2;
	}

	public double getFirstNumber() {
		return this.firstNumber;
	}

	public double getSecondNumber() {
		return this.secondNumber;
	}
	public double getAddResult() {
		return firstNumber+secondNumber;
	}
	public double getSubResult() {
		return firstNumber-secondNumber;
	}
	public double getMulResult() {
		return firstNumber*secondNumber;
	}
	public double getDivResult() {
		return firstNumber/secondNumber;
	}
}
