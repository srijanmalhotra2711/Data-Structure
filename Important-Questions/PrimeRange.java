import java.io.*;
import java.util.Scanner;

public class PrimeRange {

    public static void main(String[] args) {
        int i, j, low, high, div;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Lower Range:");
        low = sc.nextInt();
        System.out.print("Enter the Higher Range:");
        high = sc.nextInt();
        for(i=low;i<=high;i++)
        {
            int count = 0;
            for(div = 2;div*div<=i;div++)
            {
                if(i % div == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
                System.out.println("Prime:" + i);
        }
    }
}
