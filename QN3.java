package workshop03;
import java.util.Scanner;
public class QN3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int userinput;
		do {
			System.out.println("Enter a number (0 for exit): ");
			userinput = input.nextInt();
			if(userinput != 0 ) {
				System.out.println("Your entered "+userinput);
			}else {
				System.out.println("Your entered "+userinput+",so exiting from the program.");
			}
		}while(userinput!=0);
		input.close();
	}

}
