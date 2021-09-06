
public class Sahith{
    public static void main(String args[]){
    	
       SimpleCalculator cal=new SimpleCalculator();
       cal.setFirstNumber(10);
       cal.setSecondNumber(4);
       System.out.println(cal.getFirstNumber());
       System.out.println(cal.getSecondNumber());
       System.out.println("Addition = "+cal.getAddResult());
       System.out.println("Substraction = "+cal.getSubResult());
       System.out.println("Multiply = "+cal.getMulResult());
       System.out.println("Division = "+cal.getDivResult());

    }
}
