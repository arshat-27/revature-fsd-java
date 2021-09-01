import java.util.Scanner;
public class ShortNameFinder {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter The Name : ");
		String name=scanner.nextLine();
		scanner.close();
		if (name.length()>1 && name.length()<7) {
			System.out.println("SHORT NAME");
		}
		else {
				System.out.println("Not A Short Name ");
			}
	    	
	    }
		

	}


