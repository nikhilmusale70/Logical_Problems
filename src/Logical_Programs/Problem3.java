package Logical_Programs;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for which you want to check if it is prime or not :- ");
        int number = sc.nextInt();
        int j=0;
        for (int i=2; i<number ;i++){
                if (number%i==0) {
                    j++;
                    break;
                }

        }
        if (j==0)
            System.out.println(number+" is prime" );
        else
            System.out.println(number+" is not prime");
    }
}
