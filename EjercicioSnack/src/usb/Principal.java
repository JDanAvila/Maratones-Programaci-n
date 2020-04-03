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
        Scanner lector = new Scanner(System.in);
        double total = 0;
        System.out.println("1.   Cachorro Quente   R$4.00");
        System.out.println("2.   X-Salada          R$4.50");
        System.out.println("3.   X-Bacon           R$5.00");
        System.out.println("4.   Torrada simples   R$2.00");
        System.out.println("5.   Refrigerante      R$1.50");
        System.out.println("Ingrese codigo del producto: ");
        int x = lector.nextInt();
        System.out.println("Cantidad: ");
        int y = lector.nextInt();
        
        switch(x){
            case 1:
                total = (double) (4.00 * y);
                break;
            case 2:
                total = (double) (4.50 * y);
                break;
            case 3:
                total = (double) (5.00 * y);
                break;
            case 4:
                total = (double) (2.00 * y);
                break;
            case 5:
                total = (double) (1.50 * y);
                break;
            default:
                System.out.println("No existe el producto");
        }
        
        System.out.println("Total: R$" + String.format("%.2f", total));
    }
}
