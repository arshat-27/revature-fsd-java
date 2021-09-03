
public class ProfitCalculatorMethod {

	public static void main(String[] args) {
		System.out.println("Profit = " +profitCalculator(20,100));
	}
	public static float profitCalculator(float byingPrice , float sellingPrice) {
		float profit = sellingPrice - byingPrice;
		return profit;
	}
}
