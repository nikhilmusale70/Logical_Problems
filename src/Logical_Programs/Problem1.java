package Logical_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter how many terms you want to calculate :- ");
        int number = sc.nextInt();
        int a=0;
        int b=1;
        int temp;
        int c;

        System.out.println("Fibbonaci series :- ");

        System.out.print(a );
        for (int i=0;i<number;i++){
            System.out.print( " , " + b );
            c = a+b;

            a = b;
            b = c;
        }

    }
}
