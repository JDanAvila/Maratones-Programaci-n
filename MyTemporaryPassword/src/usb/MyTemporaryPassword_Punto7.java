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
public class MyTemporaryPassword_Punto7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n;
        n = lector.nextInt();
        String str;
        while ((n--) != 0) {
            str = lector.next();
            if (str.length() != 20) {
                System.out.print("INVALID DATA\n");
            } else if (str.charAt(0) != 'R' || str.charAt(1) != 'A') {
                System.out.print("INVALID DATA\n");
            } else {
                String temp = "";
                boolean invalid = false;
                boolean pass = false;
                for (int i = 2; i < str.length(); i++) {
                    if (str.charAt(i) > 48 && str.charAt(i) <= 57) {
                        pass = true;
                        temp = temp + str.charAt(i);
                    } else if (str.charAt(i) == 48) {
                        if (pass) {
                            temp = temp + '0';
                        }
                    } else {
                        invalid = true;
                        break;
                    }
                }
                if (invalid) {
                    System.out.print("INVALID DATA\n");
                } else {
                    System.out.print(temp);
                    System.out.print("\n");
                }
            }
        }
    }
}
