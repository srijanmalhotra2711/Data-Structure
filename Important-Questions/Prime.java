import java.io.*;
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        int i,j,n,t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of inputs:");
        n = sc.nextInt();
        if(n==0||n==1)
        {
            System.out.println("Not Prime");
        }
        else
        {
            for(i=0;i<=n;i++) {
                t = sc.nextInt();
                int count = 0;
                for (j = 2; j * j <= n; j++) {
                    if (n % j == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not Prime");
                }
            }
        }
    }
}
