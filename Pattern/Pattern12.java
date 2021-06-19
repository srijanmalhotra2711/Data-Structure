package com.company;
import java.io.*;
import java.util.Scanner;

public class Pattern12 {

    public static void main(String[] args) {
        int a, i, j, k, l, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        a = sc.nextInt();
        k=0;
        l=1;
        sum=0;
        for(i=1;i<=a;i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(k+"   ");
                sum = k + l;
                k = l;
                l = sum;
            }
            System.out.println();
        }
    }
}