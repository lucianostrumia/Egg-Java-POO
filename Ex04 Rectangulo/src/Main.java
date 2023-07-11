import Entidades.Rectangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangulo rect1 = new Rectangulo();

        crearRectangulo(rect1);

        System.out.println("La superficie del rectangulo es "+calcSuperficie(rect1)+".");
        System.out.println("El perimetro del rectangulo es "+calcPerimetro(rect1)+".");

        imprimirRect(rect1);


    }

    public static void crearRectangulo(Rectangulo rect) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la base del rectangulo");
        rect.setBase(leer.nextInt());
        System.out.println("Ingrese la altura");
        rect.setAltura(leer.nextInt());
    }
    public static int calcSuperficie(Rectangulo rect) {

        return rect.getAltura() * rect.getBase();
    }
    public static int calcPerimetro(Rectangulo rect) {

        return (rect.getBase() + rect.getAltura())*2;
    }
    public static void imprimirRect(Rectangulo rect) {

        for (int i = 0; i < rect.getAltura(); i++) {
            for (int j = 0; j < rect.getBase(); j++) {
                if (i == 0 || i == rect.getAltura()-1 || j == 0 || j == rect.getBase()-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

