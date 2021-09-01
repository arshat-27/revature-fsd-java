import java.util.Scanner;

public class AvgStudentFinder {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter The Score : ");
		int score = scanner.nextInt();
		scanner.close();
		if (score >= 60 && score <= 70) {
			System.out.print("AVG STUDENT");
		}
		else  {
			System.out.print("NOT AVG STUDENT");
		}

	}

}
