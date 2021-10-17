import java.util.*;
public class PrimeNumber {
	
	public static void main(String args[]) {
		int n,i,c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		n=s.nextInt();
		
		for(i=2;i<n;i++)
		{
			if(n%i ==0)
			{
				c++;
				break;
			}
		}
		if(c==0) {
			System.out.println("This is a Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}
	
}
