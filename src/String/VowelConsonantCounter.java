package String;

import java.util.Scanner;

public class VowelConsonantCounter {
//   Count Vowels & Consonants → Count vowels and consonants in a string.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String string = sc.next();

        string.toLowerCase();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            // Check if it's a letter
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        sc.close();
    }
}
