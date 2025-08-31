package String;

import java.util.Scanner;

public class ReverseString {
    //  Reverse a String → Without using StringBuilder.reverse().
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to reverse: ");
        String string = sc.next();

        char[] chars = string.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        String reversed = new String(chars);
        System.out.println("The reversed string is: " + reversed);

        sc.close();
    }
}
