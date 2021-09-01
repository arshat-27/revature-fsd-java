import java.util.Scanner;
public class DiscountAmountCalculator {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter Bill Amount : ");
	float billAmount=scanner.nextFloat();
	System.out.print("Enter Discoutn % : ");
	float discountPercentage=scanner.nextFloat();
	
	scanner.close();
	float discountAmount=(billAmount*discountPercentage)/100;
	System.out.println("Discount Amount =  "+discountAmount);
	
	

	}

}
