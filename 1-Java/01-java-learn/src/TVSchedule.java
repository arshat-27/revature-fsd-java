
public class TVSchedule {

	public static void main(String[] args) {
		int date = 2;
		while (date <= 31) {
			System.out.println(date);
			date = date + 3;
		}
		System.out.println("Using DO WHILE LOOP : ");
		date = 2;
		do{
			
			System.out.println(date);
			
			date = date + 3;
			
		}while (date <= 31);
		
		System.out.println("Using For LOOP : ");
		for(date=2;date<=31;date+=3) {
			System.out.println(date);
		}
			
	
		}

	}


