package workshop03;

import java.util.Arrays;

public class QN6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] array = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8};
		System.out.println(Arrays.toString(array));
		double sum = 0.0;
		double avg;
		for(int i=0;i<array.length;i++) {
			sum += array[i];
		}
		System.out.println(sum);
		avg = sum/array.length;
		System.out.println("The average of the given array is: "+avg);
	}

}
