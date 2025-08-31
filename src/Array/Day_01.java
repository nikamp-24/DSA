package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Day_01 {
    //    Print Array Elements → Take user input for an array and print it.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
