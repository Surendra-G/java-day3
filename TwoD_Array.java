package workshop03;
import java.util.Scanner;
public class TwoD_Array {

	public static void main(String[] args) {
		// 2D Array
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int rows = input.nextInt();
		System.out.println("Enter the columns: ");
		int columns = input.nextInt();
		int [][] array = new int[rows][columns];
		
		System.out.println("Enter the elements of array: ");
		for (int i=0;i<=rows;i++) {
			for(int j=0;j<=columns;j++) {
				System.out.println("Enter element at position [\" + i + \"][\" + j + \"]: ");
				array[i][j]=input.nextInt();
			}
		}
		input.close();
	}

}
