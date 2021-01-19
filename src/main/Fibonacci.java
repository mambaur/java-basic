package main;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int num, a=0, b=0, c=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input jumlah deret :");
        num = scanner.nextInt();

        // Non recursive / iterative
        for (int i=0; i<num; i++){
            a = b;
            b = c;
            c = a+b;
            System.out.println(a + " ");
        }

        System.out.println("==============================");

        // Recursive
        int j = 0;
        for (int i=0; i<num; i++){
            System.out.print(fibonacci(j)+" ");
            j++;
        }
    }

    static int fibonacci(int value){
        if(value == 0 || value == 1){
            return value;
        }else{
            return fibonacci(value-1)+fibonacci(value-2);
        }
    }
}
