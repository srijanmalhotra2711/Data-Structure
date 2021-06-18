package com.company;
import java.io.*;
import java.util.Scanner;

public class Pattern3 {

    public static void main(String [] args){
        int a,i,j,k,np,ns;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        a = sc.nextInt();
        np = 1;
        ns = a-1;
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=ns;j++)
            {
                System.out.print("  ");
            }
            for(k=1;k<np;k++)
            {
                System.out.print("* ");
            }
            np++;
            ns--;
            System.out.println();
        }
    }
}
