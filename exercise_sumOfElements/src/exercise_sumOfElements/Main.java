package exercise_sumOfElements;

public class Main {

	public static void main(String[] args) {
		
		int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
		int sum = 0;
		
		System.out.println("The array is: ");
		
		for(int[] num:arr) {
			for(int val:num) {
				sum += val;
				System.out.print(val + " ");
			} System.out.println();
		}
		System.out.println("The sum of all the values of the array is: " + sum);
	}

}
