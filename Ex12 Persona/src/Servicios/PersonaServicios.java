package Servicios;

import Entidades.Persona;

import java.util.Date;
import java.util.Scanner;

public class PersonaServicios {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void crearPersona(Persona p) {

        System.out.println("Ingrese el nombre");
        p.setNombre(input.nextLine());
        System.out.println("Ingrese el dia de la fecha de nacimiento");
        int dia = input.nextInt();
        System.out.println("Ingrese el mes de la fecha de nacimiento");
        int mes = input.nextInt();
        System.out.println("Ingrese el anio de la fecha de nacimiento");
        int anio = input.nextInt();

        p.setFechaDeNac(dia, mes, anio);
    }
    public int calcularEdad(Persona p) {

        Date fechaActual = new Date();
        int edad = 0;
        //System.out.println(fechaActual);
        //System.out.println(p.getFechaDeNac());

        if (fechaActual.getMonth() > p.getFechaDeNac().getMonth()) {
            edad = fechaActual.getYear() - p.getFechaDeNac().getYear();
            } else if (fechaActual.getMonth() == p.getFechaDeNac().getMonth() && fechaActual.getDay() < p.getFechaDeNac().getDay()) {
                edad = fechaActual.getYear() - p.getFechaDeNac().getYear();
        } else {
            edad = fechaActual.getYear() - p.getFechaDeNac().getYear() -1;
        }
        return edad;
    }
    public boolean menorQue(Persona p1, Persona p2) {


        System.out.println("Ingrese el nombre de la nueva persona");
        p2.setNombre(input.next());
        System.out.println("Ingrese la fecha de nacimiento de otra persona para comparar edad:");
        System.out.println("Ingrese dia:");
        int dia = input.nextInt();
        System.out.println("Ingrese mes");
        int mes = input.nextInt();
        System.out.println("Ingrese año");
        int anio = input.nextInt();
        p2.setFechaDeNac(dia, mes, anio);

        if (p1.getFechaDeNac().compareTo(p2.getFechaDeNac()) < 0) {
            return true;
        } else {
            return false;
        }
    }
    public void mostrarPersona(Persona p) {
        System.out.println("La segunda persona es:");
        System.out.println("Nombre"+p.getNombre());
        System.out.println("Fecha de nacimiento: "+p.getFechaDeNac());
    }
}
