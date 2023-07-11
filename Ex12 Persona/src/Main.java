import Entidades.Persona;
import Servicios.PersonaServicios;

public class Main {
    public static void main(String[] args) {

        PersonaServicios ps = new PersonaServicios();

        Persona p1 = new Persona();
        ps.crearPersona(p1);

        System.out.println("La edad de la persona es "+ps.calcularEdad(p1));

        Persona p2 = new Persona();

        System.out.println("La persona ingresada es menor que la persona anterior: " + ps.menorQue(p1, p2));
        System.out.println("");
        ps.mostrarPersona(p2);
    }
}