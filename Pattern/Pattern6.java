import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a = scn.nextInt();

        int ns = a / 2 + 1;
        int np = 1;

        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= ns; j++) {
                System.out.print("*	");
            }
            for(int j = 1; j <= np; j++) {
                System.out.print("	");
            }
            for(int j = 1; j <= ns; j++) {
                System.out.print("*	");
            }

            if (i <= a / 2) {
                ns--;
                np += 2;
            } else {
                ns++;
                np -= 2;
            }
            System.out.println();
        }
    }
}