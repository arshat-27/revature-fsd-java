import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter a Number : ");
		 int n = Integer.parseInt(s.nextLine());
		for(int i=1;i<=10;i++) {
			System.out.println(String.format("%2d * %2d = %2d",n ,i, n*i));
		}


	}

}
