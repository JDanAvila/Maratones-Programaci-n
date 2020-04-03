package usb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();
        if (n <= 10000) {
            for (int i = 0; i < n; i++) {
                int r1 = lector.nextInt();
                int r2 = lector.nextInt();
                int t = ((r1 * 2) + (r2 * 2)) / 2;
                System.out.println(t);
            }
        }
    }
}
