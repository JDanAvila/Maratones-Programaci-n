package usb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {       
        Scanner lector = new Scanner(System.in);
        while (lector.hasNext()) {
            int a = lector.nextInt();
            double b = 0, c = 0;
            for (int i = 1; i <= a; i++) {
                int N = lector.nextInt();
                int C = lector.nextInt();
                b = b + (N * C);
                c = c + C;
            }
            c = c * 100;
            System.out.printf("%.4f\n", b / c);
        }
    }
}
