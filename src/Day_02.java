import java.util.Scanner;

public class Day_02 {
//    Find Maximum Element → Return the max element in the array.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements of array: ");

        for (int i = 1; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i =0; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("The maximum element in an array is: " + max);
        sc.close();
    }
}
