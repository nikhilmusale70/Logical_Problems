package Logical_Programs;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double start=0;
        double end=0;
        System.out.println("Press any key to start stop watch");
        int a = sc.nextInt();
        if (true)
            start = System.currentTimeMillis();
        System.out.println("Press any key to stop");
        int b = sc.nextInt();
        if (true)
            end = System.currentTimeMillis();


        double result = (end - start)/1000.0;
        System.out.println(result + " Seconds");
    }
}
