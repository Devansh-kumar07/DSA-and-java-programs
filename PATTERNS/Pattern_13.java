package PATTERNS;

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    for(int i = 1; i <= n; i++ ){
        int a = 1;
        for(int j = 1; j <= i; j++ ){
            System.out.print(a+" ");
            a+=2;
        }
        System.out.println();
    }
    }
}

// output
// 1
// 1 3
// 1 3 5
// 1 3 5 7
// 1 3 5 7 9

