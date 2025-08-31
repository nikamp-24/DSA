package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Day_03 {
    //   Reverse an Array → Without using extra space.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");

        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter " + size + " array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length- 1 - i];
            arr[arr.length - 1- i] = temp;

        }
        System.out.println("The reversed array is :" + Arrays.toString(arr));

    }
}
