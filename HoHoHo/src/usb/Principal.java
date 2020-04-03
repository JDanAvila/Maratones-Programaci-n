package usb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int x = lector.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print("Ho ");
        }
        System.out.println("!");
    }   
}
