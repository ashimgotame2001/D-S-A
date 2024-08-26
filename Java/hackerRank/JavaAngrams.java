package Java.hackerRank;

/*
 * @Created At 26/08/2024
 * @Author ashim.gotame
 */

import java.util.Scanner;

public class JavaAngrams {

    static boolean isAnagram(String a, String b) {
        // Check if lengths are different, immediately return false if so
        if (a.length() != b.length()) {
            return false;
        }

        // Convert strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Convert strings to char arrays
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();

        // Sort the char arrays manually
        sortCharArray(charArrayA);
        sortCharArray(charArrayB);

        // Compare sorted char arrays
        for (int i = 0; i < charArrayA.length; i++) {
            if (charArrayA[i] != charArrayB[i]) {
                return false;
            }
        }

        return true;
    }

    // Method to manually sort a char array
    static void sortCharArray(char[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    char temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}


