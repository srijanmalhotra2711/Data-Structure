import java.io.*;
import java.util.Scanner;

public class DisplayDigitsReverse {
    public static void main(String[] args) {
        int d,n,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        n = sc.nextInt();
        int temp = n;
        while(n>0)
        {
            n = n/10;
        }
        while(temp>0)
        {
            d = temp % 10;
            System.out.println("Digit:" + d);
            temp=temp/10;
        }
    }
}
