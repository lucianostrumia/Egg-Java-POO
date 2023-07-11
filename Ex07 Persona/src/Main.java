import Entidades.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();

        crearPersona(p1);
        crearPersona(p2);
        crearPersona(p3);
        crearPersona(p4);

        int[] IMCArray = new int[4];
        boolean[] edadArray = new boolean[4];

        for (int i = 0; i < IMCArray.length; i++) {
            IMCArray[i] = calcularIMC()
        }

        int ind1 = calcularIMC(p1); boolean edad1 = esMayorDeEdad(p1);
        int ind2 = calcularIMC(p2); boolean edad2 = esMayorDeEdad(p2);
        int ind3 = calcularIMC(p3); boolean edad3 = esMayorDeEdad(p3);
        int ind4 = calcularIMC(p4); boolean edad4 = esMayorDeEdad(p4);


        if (edad1 == true) {
            if (ind1 < 0) {
                System.out.println("La persona 1 es mayor de edad y esta por debajo de su peso ideal");
            } else if (ind1 > 0) {
                System.out.println("La persona 1 es mayor de edad y esta por encima de su peso ideal");
            } else {
                System.out.println("La persona 1 es mayor de edad y su peso es ideal");
            }
        } else {
            if (ind1 < 0) {
                System.out.println("La persona 1 es menor de edad y esta por debajo de su peso ideal");
            } else if (ind1 > 0) {
                System.out.println("La persona 1 es menor de edad y esta por encima de su peso ideal");
            } else {
                System.out.println("La persona 1 es menor de edad y su peso es ideal");
            }
        }

        if (edad2 == true) {
            if (ind2 < 0) {
                System.out.println("La persona 2 es mayor de edad y esta por debajo de su peso ideal");
            } else if (ind2 > 0) {
                System.out.println("La persona 2 es mayor de edad y esta por encima de su peso ideal");
            } else {
                System.out.println("La persona 2 es mayor de edad y su peso es ideal");
            }
        } else {
            if (ind2 < 0) {
                System.out.println("La persona 2 es menor de edad y esta por debajo de su peso ideal");
            } else if (ind2 > 0) {
                System.out.println("La persona 2 es menor de edad y esta por encima de su peso ideal");
            } else {
                System.out.println("La persona 2 es menor de edad y su peso es ideal");
            }
        }

        if (edad3 == true) {
            if (ind3 < 0) {
                System.out.println("La persona 3 es mayor de edad y esta por debajo de su peso ideal");
            } else if (ind3 > 0) {
                System.out.println("La persona 3 es mayor de edad y esta por encima de su peso ideal");
            } else {
                System.out.println("La persona 3 es mayor de edad y su peso es ideal");
            }
        } else {
            if (ind3 < 0) {
                System.out.println("La persona 3 es menor de edad y esta por debajo de su peso ideal");
            } else if (ind3 > 0) {
                System.out.println("La persona 3 es menor de edad y esta por encima de su peso ideal");
            } else {
                System.out.println("La persona 3 es menor de edad y su peso es ideal");
            }
        }

        if (edad4 == true) {
            if (ind4 < 0) {
                System.out.println("La persona 4 es mayor de edad y esta por debajo de su peso ideal");
            } else if (ind4 > 0) {
                System.out.println("La persona 4 es mayor de edad y esta por encima de su peso ideal");
            } else {
                System.out.println("La persona 4 es mayor de edad y su peso es ideal");
            }
        } else {
            if (ind4 < 0) {
                System.out.println("La persona 4 es menor de edad y esta por debajo de su peso ideal");
            } else if (ind4 > 0) {
                System.out.println("La persona 4 es menor de edad y esta por encima de su peso ideal");
            } else {
                System.out.println("La persona 4 es menor de edad y su peso es ideal");
            }
        }



    }

    public static void crearPersona(Persona p) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo");
        char a = leer.next().charAt(0);
        if (!Character.toString(a).equalsIgnoreCase("h") || !Character.toString(a).equalsIgnoreCase("m") || !Character.toString(a).equalsIgnoreCase("o")) {
            System.out.println("El sexo ingresado no es valido, por favor intente nuevamente (Ingrese 'H', 'M' u 'O')");
            a = leer.next().charAt(0);
        } else {
            p.setSexo(a);
        }
        System.out.println("Ingrese el peso");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura");
        p.setAltura(leer.nextDouble());
    }

    public static int calcularIMC(Persona p) {

        if ((p.getPeso() / (p.getAltura()*p.getAltura())) < 20) {
            return -1;
        } else if ((p.getPeso() / (p.getAltura()*p.getAltura())) >= 20 && (p.getPeso() / (p.getAltura()*p.getAltura())) <= 25 ) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean esMayorDeEdad(Persona p) {

        if (p.getEdad() >= 18) {
            return true;
        } else {
            return false;
        }
    }
}