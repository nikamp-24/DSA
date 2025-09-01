package SearchingTechniques;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLastOccurrence {
    //    First & Last Occurrence → Find first and last occurrence of an element in a sorted array.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter "+size+" sorted elements: ");
        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to find: ");
        int target = sc.nextInt();

        System.out.println("DEBUG: Input read successfully.");

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        if (first == -1) {
            System.out.println("Element not found in array.");
        } else {
            System.out.println("First occurrence at index: " + first);
            System.out.println("Last occurrence at index: " + last);
        }

        sc.close();
    }

    public static int firstOccurrence(int[] arr, int target) {
        int start = 0 ;
        int end = arr.length -1;
        int result = -1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid]==target){
               result = mid;
               end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            }
            else {
                end = mid - 1;
            }

        }
        return result;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while (start<= end){
            int mid = start+(end-start)/2;
            if (arr[mid] == target){
                result = mid;
                start = mid +1;
            } else if (arr[mid]<target) {
                start = mid+1;
            }else {
                end= mid-1;
            }
        }
        return result;
    }


}
