package main;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input text 1 : ");
        String text1 = scan.nextLine();
        System.out.print("Input text 2 : ");
        String text2 = scan.nextLine();

        if (text1.length() == text2.length()){
            char[] arrayText1 = text1.toCharArray();
            char[] arrayText2 = text2.toCharArray();

            Arrays.sort(arrayText1);
            Arrays.sort(arrayText2);

            if (Arrays.equals(arrayText1, arrayText2)){
                System.out.println(text1 + " and "+text2+" are anagram");
            }else{
                System.out.println(text1 + " and "+text2+" are not anagram");
            }
        }else{
            System.out.println(text1 + " and "+text2+" are not anagram");
        }
    }
}
