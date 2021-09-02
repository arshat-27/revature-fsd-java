
public class FahrenheitConverter {

	public static void main(String[] args) {
	System.out.println("Fahrenheit : "+ toFahrenheit(12));	

	}
	public static float toFahrenheit(float celcius) {
		float fahrenheit = (celcius * 9 / 5f) + 32;
		return fahrenheit;
	}

}
