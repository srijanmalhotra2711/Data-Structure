package com.company;
import java.io.*;
import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {
        int a, i, j, k, np, ns;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        a = sc.nextInt();
        np = a;
        ns = 0;
        for(i = 1; i <= a; i++)
        {
            for(j = 1; j <= ns; j++)
            {
                System.out.print("	");
            }
            for(k = 1; k <= np; k++)
            {
                System.out.print("*	");
            }
            np--;
            ns++;
            System.out.println();
        }
    }
}