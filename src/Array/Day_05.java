package Array;

import java.util.Scanner;

public class Day_05 {
 //   Sum of Array Elements → Calculate sum and average of elements.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter " + size + " array elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0 ;
        for (int num: arr){
            sum += num;
        }

        int average = sum/size;

        System.out.println("The sum  of array elements is :" + sum+ " and average is :" + average);
    }
}
