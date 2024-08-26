package Java.hackerRank;

/*
 * @Created At 26/08/2024
 * @Author ashim.gotame
 */

import java.util.Scanner;

public class JavaStringIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length() + B.length());
        System.out.println(checkSize(A,B));
        System.out.println(getNameInCapatilize(A,B));
    }
    public static String checkSize(String a , String b){
       int outputA = a.compareTo(b);
       int outputB = b.compareTo(a);
       if (outputA > outputB){
           return "Yes";
       }else {
           return "No";
       }
    }

    private static String getNameInCapatilize(String a , String b){

        String outputA = a.substring(0, 1).toUpperCase();
        String nameCapitalized = outputA + a.substring(1);


        String outputB = b.substring(0, 1).toUpperCase();
        String nameCapitalizedB = outputB + b.substring(1);


        return nameCapitalized + " " + nameCapitalizedB;
    }
}
