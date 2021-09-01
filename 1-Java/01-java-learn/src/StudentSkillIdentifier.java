import java.util.Scanner;

//hw
public class StudentSkillIdentifier {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter The Score : ");
		int score = scanner.nextInt();
		scanner.close();
		if (score >= 0 && score <= 34) {
			System.out.print("Poor");
		}
		else if(score >= 35 && score <= 59)  {
			System.out.print("Below Average");
		}
		else if(score >=60 && score <= 75)  {
			System.out.print("Average");
		}
		else if(score >= 76 && score <= 80)  {
			System.out.print("Above Average");
		}
		else if(score >= 81 && score <= 100)  {
			System.out.print("Extraordinary");
		}
		else {
			System.out.println("Enter correct marks...!!!");
		}

	}

}
