package Java.hackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/*
 * @Created At 26/08/2024
 * @Author ashim.gotame
 */
public class PatternSyntaxCheck {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            try{
                Pattern pattern2 = Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException e)
            {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }

    }

