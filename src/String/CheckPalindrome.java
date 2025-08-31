package String;

import java.util.Scanner;

public class CheckPalindrome {
//    Palindrome String → Check if a string is a palindrome.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String string = sc.nextLine();

        int start = 0;
        int end = string.length()-1;

        while (start<end){
            if (string.charAt(start) != string.charAt(end)){
                System.out.print("The given string is not palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("The string is a palindrome string ");
    }
}
