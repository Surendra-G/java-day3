package workshop03;

public class QN11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array2D = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		int sum = 0;
		for (int[] row : array2D) {
            for (int value : row) {
                sum += value; // Adding each element to the sum
            }
        }
		System.out.println("The sum of all elements in the 2D array is: " + sum);
	}

}
