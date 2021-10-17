
public class P1 {

	public static void main(String[] args) {
		int n = 5;
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < n; c++) {
				if (c == 2 || r == 2)
					System.out.print("0 ");
				else
					System.out.print("1 ");

			}
			System.out.println();
		}

	}

}
