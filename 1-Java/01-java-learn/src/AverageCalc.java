
public class AverageCalc {

	public static void main(String[] args) {
		// scores[]= {48,55,92,78,64};
		float[] scores=new float[5];
		scores[0]=48;
		scores[1]=55;
        scores[2]=92;
        scores[3]=78;
        scores[4]=64;
		//System.out.println(scores[0]);
		//System.out.println(scores[1]);
		//float avg= (scores[0]+scores[1]+scores[2]+scores[3]+scores[4])/5.0f;
		float avg= (scores[0]+scores[1]+scores[2]+scores[3]+scores[4])/scores.length;
		System.out.println("Average = "+avg);
	}

}
