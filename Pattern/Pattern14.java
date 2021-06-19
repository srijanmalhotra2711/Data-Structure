package com.company;
import java.io.*;
import java.util.Scanner;

public class Pattern14 {

    public static void main(String[] args) {
        int a, i, Product;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        a = sc.nextInt();
        Product = 0;
        for(i=1;i<=10;i++)
        {
            Product = a * i;
            System.out.println(a + "x" + i + "=" + Product);
        }
    }
}