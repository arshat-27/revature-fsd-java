import java.util.Scanner;
public class ProfitCalculatorScanner {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter The Buying Price : ");
		int buyingPrice=scanner.nextInt();
		System.out.print("Enter The Selling Price : ");
		int sellingPrice=scanner.nextInt();
		scanner.close();
		int profit=sellingPrice-buyingPrice;
		System.out.println("Profit = "+profit);
	}

}
