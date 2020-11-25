package main;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        // Find prime number
        int check=0, num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        num = scanner.nextInt();
        for (int i =2; i<=num; i++){
            if (num%i == 0){
                check++;
            }
        }
        if (check == 1){
            System.out.println(num+" is prime");
        }else{
            System.out.println(num+" is not prime");
        }

        System.out.println("===============================");

        // List prime number
        for (int i=0; i<30; i++){
            int temp = 0;
            for (int j=1; j<=i; j++){
                if (i%j==0){
                    temp++;
                }
            }
            if (temp==2){
                System.out.print(i +" ");
            }
        }
    }
}
