package exercise_Project2;

public class Average_calculator {
	
	public double average(double[] temp) {
		
		double sum = 0 ;
		for(int i=0;i<temp.length;i++) {
			sum += temp[i];
		}
		return sum;
	}

}
