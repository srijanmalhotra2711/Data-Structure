package com.company;
import java.io.*;
import java.util.Scanner;

public class Pattern13 {

    public static void main(String[] args) {
        int a, i, j, k, l, product;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        a = sc.nextInt();
        k = 11;
        for(i=1;i<=a;i++)
        {
            for (j = 1; j <= i; j++)
            {
                //System.out.println(k+"   ");
                System.out.print(Math.pow(11, a));
            }
            System.out.println();
        }
    }
}