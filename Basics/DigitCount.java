import java.io.*;
import java.util.Scanner;

public class DigitCount {
    public static void main(String []args){
        int d,n;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        n = sc.nextInt();
        while(n>0)
        {
            n = n/10;
            i++;
        }
        System.out.println("Digits:"+ i);
    }
}
