package com.company;
import java.io.*;
import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args){
        int a, i, j, k, np, ns;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        a = sc.nextInt();
        ns=1;
        np=a/2;
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=np;j++)
            {
                System.out.print("  ");
            }
            for(k=1;k<=ns;k++)
            {
                System.out.print("*  ");
            }
            if(i<=a/2)
            {
                ns = ns + 2;
                np--;
            }
            else
            {
                ns = ns - 2;
                np++;
            }
            System.out.println();
        }
    }
}
