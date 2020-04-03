package usb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int contador = 0, sum = 0;
        int x = lector.nextInt();
        int z = lector.nextInt();        
        while(z <= x){
            z = lector.nextInt();
        }
        while(sum < z){
            sum += x;
            x++;
            contador++;
        }
        System.out.println(contador);
    }
}
