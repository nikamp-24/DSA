package Array;

import java.util.Scanner;

public class Day_04 {
    //   Second largest Element → Find the second largest element in the array.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");

        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter " + size + " array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        if (size<2){
            System.out.println("Array must have at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secLarget = Integer.MIN_VALUE;

        for (int num: arr) {
            if (num > largest) {
                secLarget = largest;
                largest = num;
            } else if (num < largest && num > secLarget) {
                secLarget = num;
            }
        }
        if (secLarget == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements are equal).");
        } else {
            System.out.println("Second largest element: " + secLarget);
        }

        sc.close();

    }
}
