import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String n = s.nextLine();
		String[] words = n.split("");
		for (int i = 0; i < words.length; i++) {
			for (int j = words[i].length() - 1; j >= 0; j--) {
				System.out.print(words[i].charAt(j));

			}

		}

	}
}
