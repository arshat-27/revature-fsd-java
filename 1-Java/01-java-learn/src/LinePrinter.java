
public class LinePrinter {

	public static void main(String[] args) {
		printLine();
		printLine2();
		printLine(30);
		printLine(50);
		
	}
	public static void printLine() {
		System.out.println("-----------------------------");
	}
	public static void printLine2() {
		System.out.println("8888888888888888888888888888");
	}
	//Method Overloading Polymorphism
	public static void printLine(int noc) {
		for (int i=0;i<noc;i++) {
			System.out.print("-");
			
		}
		System.out.println();
	}
	
}

