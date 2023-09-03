package exercise_countingEvenNumbers;

public class Main {

	public static void main(String[] args) {
		
		int[][] arr = {{0,14,2},{4,16,5},{6,7,8},{9,10,12}};		
		int count = 0;
		
		System.out.println("The array is: ");
		
		for(int[]row:arr) {
			for(int column:row) {
				System.out.print(column + " ");
				if(column %2 ==0) {
					count++;
				}
			}System.out.println();
		}System.out.println("The amount of even numbers in the array is: " + count);

	}

}
