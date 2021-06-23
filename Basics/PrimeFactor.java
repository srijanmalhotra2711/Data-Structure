import java.io.*;
import java.util.Scanner;

public class PrimeFactor {
    public static void main(String []args){
        int n,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        for(d=2;d<=n;d++)
        {
            while(n % d == 0)
            {
                System.out.println("Prime Factors");
                System.out.print(d + " ");
                n = n / d;
            }
        }
    }
}
