import java.util.Scanner;
public class MobileMenuExit {

	public static void main(String[] args) {
		int i=0;
		Scanner scanner = new Scanner(System.in);
		while(i==0) {
			
			System.out.println("Menu");
			System.out.println("====");
			System.out.println("1.Balance Enquiry");
			System.out.println("2.Recharge");
			System.out.println("3.Change Caller Tune");
			System.out.println("4.Exit");
			
			System.out.print("Choose An Option : ");
			int option = scanner.nextInt();
		
			switch(option) {
			case 1:
				System.out.println("Blance Enquiry");
				break;
			case 2:
				System.out.println("Recharge");
				break;
			case 3:
				System.out.println("Change The Caller Tune");
				break;
			case 4:
				System.out.println("Exit");
				System.exit(0);
				break;
			} 
			
			
		}
	}	
		
}
	    


	
