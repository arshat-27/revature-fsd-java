package animal;

public class Dog extends Animal {
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;

	public Dog(String name, int body, int weight,int eyes,int legs,int tail,int teeth) {
		super(name, 1, 1, body, weight);
		this.eyes=eyes;
		this.legs=legs;
		this.tail=tail;
		this.teeth=teeth;
		
	}
	
	

	public static void main(String[] args) {
		
		Animal c=new Animal("haha",1,1,1,1);
		Dog d = new Dog("huhu",2,3,4,5,6,7);
		//
		System.out.println(d.eyes);
		d.eat();
		
		

	}
	private void chew() {
		System.out.println("Dog.chew is called");
	}



	@Override
	public void eat() {
		System.out.println("Dog.eat called");
		chew();
		super.eat();
	}
	public
	

}
