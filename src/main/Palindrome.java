package main;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text : ");
        String text = scanner.nextLine();

        // Palindrome using iterate / non recursive
        String temp = "";
        for (int i=text.length()-1; i>=0; i--){
            char c = text.charAt(i);
            temp += String.valueOf(c);
        }
        if(text.equals(temp)){
            System.out.println(text+" is palindrome");
        }else{
            System.out.println(text+" is not palindrome");
        }

        System.out.println("=======================================");

        // Palindrome using recursive
        System.out.println(palindrome(text));
    }

    private static String palindrome(String text){
        if (text.length()<=1){
            return "text is palindrome";
        }else if(text.charAt(0) != text.charAt(text.length()-1)){
            return "text is not palindrome";
        }
        return palindrome(text.substring(1, text.length()-1));
    }
}
