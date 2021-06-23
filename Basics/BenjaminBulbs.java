import java.io.*;
import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Bulbs:");
        n = sc.nextInt();
        for(i=1;i*i<=n;i++)
        {
            System.out.println(i*i);
        }
    }
}
