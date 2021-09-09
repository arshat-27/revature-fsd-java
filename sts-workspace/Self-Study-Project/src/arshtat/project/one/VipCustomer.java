package arshtat.project.one;

public class VipCustomer {
	private String name;
	private double creditLimit;
	private String email;

	public VipCustomer() {
		this("Default name", 100, "Default@email.com");
		System.out.println("EMPTY CONSTRUCTOR CALLED");
	}

	public VipCustomer(String name, double CreditLimit) {
		this(name, CreditLimit, "Default Email");
	}

	public VipCustomer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public double getCreditLimit() {
		return this.creditLimit;
	}

	public String getEmail() {
		return this.email;

	}

	public static void main(String[] args) {
		VipCustomer person1 = new VipCustomer("SahithVroooooooo", 1000000000);
		System.out.println("Vipname = " + person1.getName() + " Credit Limit =  " + person1.getCreditLimit()
				+ "  Email Address = " + person1.getEmail());

	}

}
