import java.io.*;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int a,b,d,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        n = sc.nextInt();
        int reverse = 0;
        int i = 1;
        while(n>0)
        {
            d = n % 10;
            a = i;
            b = d;
            reverse += (int)Math.pow(10, b-1) * a;
            n = n / 10;
            i++;
        }
        System.out.println(reverse);
    }
}
