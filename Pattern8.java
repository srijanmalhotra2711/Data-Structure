package com.company;
import java.io.*;
import java.util.Scanner;

public class Pattern8 {

    public static void main(String[] args) {
        int a, i, j, k, np, ns;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        a = sc.nextInt();
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=a;j++)
            {
                if(i + j == a + 1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
    }
}
