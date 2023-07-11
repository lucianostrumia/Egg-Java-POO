import Entidades.Circunferencia;

import java.util.Scanner;
import java.lang.System;


public class Main {
    public static void main(String[] args) {

        Circunferencia c1 = new Circunferencia(4);

        System.out.println("El area del circulo es " + area(c1) + "cm2");

        System.out.println("El perimetro del circulo es " + perimetro(c1) + "cm");

        crearCircunferencia(c1);

        System.out.println("El area del circulo es " + area(c1) + "cm2");

        System.out.println("El perimetro del circulo es " + perimetro(c1) + "cm");

    }

    public static void crearCircunferencia(Circunferencia circ) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el radio de la circunferencia:");
        circ.setRadio(leer.nextDouble());
    }

    public static double area (Circunferencia circ) {

        return circ.getRadio() * circ.getRadio() * Math.PI;
    }

    public static double perimetro (Circunferencia circ) {

        return circ.getRadio() * Math.PI * 2;
    }

}