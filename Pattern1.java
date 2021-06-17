package com.company;
import java.io.*;
import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        int a,i,j;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number:");
        a= sc.nextInt();
        for(i=0;i<a;i++)
        {
            for(j=0;j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
