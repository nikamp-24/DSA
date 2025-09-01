package SearchingTechniques;

import java.util.Scanner;

public class FirstLastOccurrenceUnsorted {
    // First & Last Occurrence → Find first and last occurrence of an element in an unsorted array.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size if the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter "+size+" array elements: ");
        for (int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to find: ");
        int target = sc.nextInt();

        int first = firstOccurence(arr, target);
        int last = lastOccurence(arr, target);

        if (first == -1) {
            System.out.println("Element not found in array.");
        } else {
            System.out.println("First occurrence at index: " + first);
            System.out.println("Last occurrence at index: " + last);
        }
    }

    public static int lastOccurence(int[] arr, int target) {

        for (int i = arr.length-1; i >= 0; i--){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int firstOccurence(int[] arr, int target) {
        for (int i = 0; i <arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
