package Service;

import Entidades.Meses;

import java.util.Scanner;

public class MesesService {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void rellenar(Meses m) {

        m.setAnio(0, "enero");
        m.setAnio(1, "febrero");
        m.setAnio(2, "marzo");
        m.setAnio(3, "abril");
        m.setAnio(4, "mayo");
        m.setAnio(5, "junio");
        m.setAnio(6, "julio");
        m.setAnio(7, "agosto");
        m.setAnio(8, "septiembre");
        m.setAnio(9, "octubre");
        m.setAnio(10, "noviembre");
        m.setAnio(11, "diciembre");
        m.setMesSecreto(m.getAnio((int)(Math.random()*12)));
    }

    public void adivinar(Meses m) {

        String mesIngresado;

        System.out.println("Adivine el mes");
        System.out.println("Ingrese el nombre del mes");
        mesIngresado = input.next();

        while (!m.getMesSecreto().equalsIgnoreCase(mesIngresado)) {
            System.out.println("Incorrecto, intente nuevamente");
            mesIngresado = input.next();
        }
        System.out.println("Correcto, adivinaste!!");

    }
}