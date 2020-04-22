/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usb;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author hp
 */
public class EquilibrioDeParentesis_PuntoG {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\hp\\3D Objects\\UNIVERSIDAD\\QUINTO SEMESTRE\\Analisis y Diseño de Algoritmos\\Parcial Corte 2\\EquilibrioDeParentesis_PuntoG\\expresiones.txt";
        File file = new File(filePath);
        Scanner lector = new Scanner(file);
        String exp = "";
        List<String> validExp = new ArrayList<String>();
        int cantValidExp = 0;

        while (lector.hasNext()) {
            exp = lector.nextLine();
            if (exp.length() >= 1 && exp.length() <= 1000) {
                cantValidExp++;
                validExp.add(exp);
            } else if (exp.length() > 1000) {
                return;
            }
        }

        if (cantValidExp >= 1 && cantValidExp <= 10000) {
            Stack<Character> stack = new Stack<Character>();
            String rta = "";
            boolean incorrect = false;

            for (int i = 0; i < cantValidExp; i++) {
                for (int j = 0; j < validExp.get(i).length(); j++) {
                    if (validExp.get(i).charAt(j) == ')' && stack.isEmpty()) {
                        rta = "incorrect";
                        incorrect = true;
                        j = validExp.get(i).length();
                    } else if (validExp.get(i).charAt(j) == '(') {
                        stack.push(validExp.get(i).charAt(j));
                    } else if (validExp.get(i).charAt(j) == ')') {
                        stack.pop();
                    }
                }

                if (incorrect == false) {
                    if (stack.isEmpty()) {
                        rta = "correct";
                    } else {
                        rta = "incorrect";
                    }
                }
                System.out.println(rta);
                stack.clear();
                incorrect = false;
            }
        }
    }
}
