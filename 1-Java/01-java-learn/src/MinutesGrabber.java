import java.util.Scanner;
public class MinutesGrabber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter The date(Hrs:Min:Sec) : ");
		String date=scanner.nextLine();
		scanner.close();
		System.out.println("Minute's = "+date.substring(3,5));

	}

}
