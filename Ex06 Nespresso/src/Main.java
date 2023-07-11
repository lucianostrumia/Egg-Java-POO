import Entidades.Cafetera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cafetera c = new Cafetera();
        c.setCapacidadMaxima(1000);
        c.setCantidadActual(200);

        System.out.println("Max: "+c.getCapacidadMaxima()+". Actual: "+c.getCantidadActual());

        agregarCafe(c);

        System.out.println("Max: "+c.getCapacidadMaxima()+". Actual: "+c.getCantidadActual());
    }

    public static void llenarCafetera(Cafetera c1) {

        c1.setCantidadActual(c1.getCapacidadMaxima());
    }

    public static void servirTaza(Cafetera c1) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la capacidad en ml de la taza a servir");
        int a = leer.nextInt();

        if (a > c1.getCantidadActual()) {
            System.out.println("La taza no pudo llenarse debido a que el cafe era insuficiente, la taza tiene "+c1.getCantidadActual()+" ml de cafe.");
            c1.setCantidadActual(0);
        } else {
            System.out.println("La taza ha sido llenada");
            c1.setCantidadActual(c1.getCantidadActual() - a);
        }
    }

    public static void vaciarCafetera(Cafetera c1) {

        c1.setCantidadActual(0);
    }

    public static void agregarCafe(Cafetera c1) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de cafe a agregar en la cafetera");
        int a = leer.nextInt();

        if (c1.getCapacidadMaxima() < c1.getCantidadActual() + a) {
            System.out.println("la cafetera no tiene capacidad para tanto cafe, ha sido rellenada y sobran "+(c1.getCantidadActual()+a- c1.getCapacidadMaxima())+" ml de cafe");
            c1.setCantidadActual(c1.getCapacidadMaxima());
        } else {
            c1.setCantidadActual(c1.getCantidadActual()+a);
        }
    }
}