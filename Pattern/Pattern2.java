package com.company;
import java.io.*;
import java.util.Scanner;

public class Pattern2 {

    public static void main(String []args){
        int a,b,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        a = sc.nextInt();
        b = a;
        for(i = 1; i <= a; i++) {
            for(j = 1; j <= b; j++) {
                System.out.print("*  ");
            }
            b--;
            System.out.println();
        }
    }
}
