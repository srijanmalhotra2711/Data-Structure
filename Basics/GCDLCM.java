import java.io.*;
import java.util.Scanner;

public class GCDLCM {
    public static void main(String []args){
        int n1,n2,t1,t2,remainder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        t1 = n1;
        t2 = n2;

        while(n1 % n2 != 0)
        {
            remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }
        int gcd = n2;
        int lcm = (t1 * t2) / n2;
        System.out.println("GCD:" + gcd);
        System.out.println("LCM:" + lcm);
    }
}
