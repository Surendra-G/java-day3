package workshop03;
import java.util.Scanner;
public class QN2 {

	public static void main(String[] args) {
		// FActorial 
		Scanner input  = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = input.nextInt();
		int fact = 1;
		while(a>0) {
			fact *= a;
			a--;
		}
		System.out.println(fact);
		input.close();
		
	}

}
