import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el dia");
        int dia = input.nextInt();
        System.out.println("Ingrese el mes");
        int mes = input.nextInt();
        System.out.println("Ingrese el año");
        int anio = input.nextInt();

        Date fecha = new Date(anio, mes, dia);
        Date fechaActual = new Date();

        System.out.println(fecha);
        System.out.println(fechaActual);

        int anioActual = fechaActual.getYear();
        int diferencia = anioActual - anio;

        if (diferencia > 0) {
            System.out.println("La diferencia de años entre la fecha actual y la ingresada es de "+diferencia+".");
        } else {
            System.out.println("No hay diferencia, ya que la fecha ingresada esta dentro del año actual.");
        }

    }
}