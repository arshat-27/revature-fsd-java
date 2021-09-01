import java.util.Scanner;
public class FahrenheitCalculator {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter The Celsius Value : ");
		float celsius = scanner.nextFloat();
		scanner.close();
		float fahrenheit = (celsius*9/5)+32;
		System.out.println("Fahrenheit = "+fahrenheit);
	

	}

}
