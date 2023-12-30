package workshop03;
import java.util.Scanner;
import java.util.Arrays;

public class QN5 {
	// print the array in reverse order
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 5;
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        
        System.out.println("Array elements in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println("\nArray as entered:");
        System.out.print(Arrays.toString(array));
        input.close();
    }
}
