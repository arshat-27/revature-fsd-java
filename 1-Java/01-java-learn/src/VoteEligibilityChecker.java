import java.util.Scanner;

public class VoteEligibilityChecker {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter The Age : ");
		int age = scanner.nextInt();
		scanner.close();
		if (age < 18) {
			System.out.print("Not Eligible");
		}
		else  {
			System.out.print("Eligible");
		}
			
		
	}

}
