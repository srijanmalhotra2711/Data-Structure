import java.io.*;
import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String []args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int max = a;
        if(b>=max)
        {
            max = b;
        }
        if(c>=max)
        {
            max = c;
        }
        if(max == a)
        {
            System.out.println((b * b + c * c) == (a * a));
        }
        else if (max == b)
        {
            System.out.println((a * a + c * c) == (b * b));
        }
        else if (max == c)
        {
            System.out.println((b * b + a * a) == (c * c));
        }
    }
}
