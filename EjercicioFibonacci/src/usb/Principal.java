package usb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int fibo = 0, a = 1, b, i = 1;
        int n = lector.nextInt();
        while (n < 0 || n > 46) {
            n = lector.nextInt();
        }
        do {
            b = fibo;
            fibo = a + fibo;
            a = b;
            System.out.print(a + " ");
            i++;
        } while (i <= n);
    }
}
