package workshop03;
import java.util.Scanner;
public class QN7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,5};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = input.nextInt();
		boolean found = false;
		for (int i=0;i<array.length;i++) {
			if(array[i] == a) {
				System.out.println(a+" is present in the given array at "+i+"th index");
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Not in the given array.");
		}
		input.close();	
	}
}
