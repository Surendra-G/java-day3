package workshop03;

public class QN8 {

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Bubble Sorting of the array {64, 34, 25, 12, 22, 11, 90} is :\n");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
