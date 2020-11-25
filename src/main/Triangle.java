package main;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input num : ");
        int num = scan.nextInt();

        triangle3(num);
    }

    private static void triangle1(int num){
        for (int i=1; i<=num; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangle2(int num){
        for (int i=1; i<=num; i++){
            for (int j=num-1; j>=i; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangle3(int num){
        for (int i = 1; i <= num; i++){
            for (int j = num-1; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++){
                System.out.print('*');
            }
            for (int l = 1; l <= i - 1; l++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
