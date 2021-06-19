package com.company;
import java.io.*;
import java.util.Scanner;

public class Pattern11 {

    public static void main(String[] args) {
        int a, i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        a = sc.nextInt();
        k=1;
        for(i=1;i<=a;i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k + "    ");
                k++;
            }
            System.out.println();
        }
    }
}