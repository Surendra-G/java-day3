package workshop03;

public class Qn10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[] = {1.1,2.2,3.3,4.4,5.5,6.6};
		double max = arr[0];
		for(double num:arr) {
			if(num>max) {
				max = num;
			}
		}
		System.out.println("The maximum value of the arrayis "+max);
	}

}
