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
public class Principal {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int t = l.nextInt();
        int v = l.nextInt();
        double ls = (double)(t*v)/12;
        System.out.println(String.format("%.3f", ls));
    }
}
