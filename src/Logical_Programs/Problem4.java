package Logical_Programs;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ënter a number you want to reverse");
        int sum = 0;
        int number = sc.nextInt();
        while (number>0){
            sum = sum*10 + number%10;
            number=number/10;
        }

        System.out.println(sum);
    }
}
