package Java.hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * @Created At 26/08/2024
 * @Author ashim.gotame
 */
public class JavaStringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        handleJavaStringToken(s);
        scan.close();
    }

    private static void handleJavaStringToken(String input) {
        // Use a regex pattern to split the input on all specified delimiters
        String[] tokens = input.split("[ !,?._'@]+");

        // Create a list to store non-empty tokens
        List<String> validTokens = new ArrayList<>();
        for (String token : tokens) {
            if (!token.isEmpty()) {
                validTokens.add(token);
            }
        }

        // Print the number of tokens
        System.out.println(validTokens.size());

        // Print each token
        for (String token : validTokens) {
            System.out.println(token);
        }
    }
}
