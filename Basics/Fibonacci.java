import java.io.*;
import java.util.Scanner;

public class Fibonacci{

    public static void main(String [] args){
        int a,b,i,n,sum;
        a = 0;
        b = 1;
        sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n:");
        n = sc.nextInt();
        System.out.print(a + " " + b);
        for(i=2;i<=n;i++)
        {
            sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
    }
}
