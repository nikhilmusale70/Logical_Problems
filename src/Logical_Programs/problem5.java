package Logical_Programs;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of distinct numbers you want");
        int number = sc.nextInt();
        Random ran = new Random();
        int []arr = new int[number];
        int z=0;

        for (int i=0;i<number;i++){
                arr[i]=ran.nextInt(100);
            }
        while (z<20){
            for (int i =0 ;i<number;i++) {
                for (int j = 0; j < number; j++) {
                    if (arr[i] == arr[j])
                        arr[i] = ran.nextInt(100);
                }
            }
            z++;
        }
        for (int c : arr) {
            System.out.println(c + " , ");
        }
    }
}
