import java.util.*;
import java.io.*;

public class Loops2 {
    public static int pow(int a, int n) {
        int rez = 1;
        while (n > 0) {
            rez *= a;
            n--;
        }
        return rez;
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int rezult = a;
            for (int j = 0; j < n; j++) {
                rezult += b * pow(2, j);
                System.out.print(rezult + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
