package Logical_Programs;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to check if it is perfect number or not :- ");
        int number = sc.nextInt();

        int sum=0;

        for (int i=1;i<=number/2;i++){
            if (number%i==0){
                sum = sum + i;
            }
        }

        if (number==sum)
            System.out.println(number+" is a perfect number");
        else
            System.out.println(number+" is not a perfect number");
    }
}
