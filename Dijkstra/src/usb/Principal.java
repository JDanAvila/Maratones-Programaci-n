package usb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        List<String> joya = new ArrayList<>();
        String x;
        boolean cambio = true;
        do {
            x = lector.next();
            if (x.contains("(") || x.contains(")")) {
                if (!joya.isEmpty()) {
                    for (int i = 0; i < joya.size(); i++) {
                        if (x.equals(joya.get(i))) {
                            cambio = true;
                            break;
                        }
                    }
                } else {
                    joya.add(x);
                }
                if (!cambio) {
                    joya.add(x);
                }
            } else {
                break;
            }

            cambio = false;
        } while (!x.contains("(") || !x.contains(")"));
        System.out.println(joya.size());
    }
}



