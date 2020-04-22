/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usb;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class HexagonalTiles_BasicB {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n;
        int[] fib = new int[41];
        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i <= 40; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        while (true) {
            n = lector.nextInt();
            if (n == 0) {
                break;
            }
            System.out.print(fib[n]);
            System.out.print("\n");
        }
    }
}
