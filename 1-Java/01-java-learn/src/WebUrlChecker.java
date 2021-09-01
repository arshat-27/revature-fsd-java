import java.util.Scanner;
public class WebUrlChecker {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("ENTER WEB ADDRESS : ");
		String url=scanner.nextLine();
		
		if (url.startsWith("http://")||url.startsWith("https://")){
			System.out.println("It Is A Url");}
		else {
				System.out.println("NOT A URL");
			}
		}
	}


