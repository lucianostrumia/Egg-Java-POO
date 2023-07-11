import Entidades.Puntos;
import Service.PuntosService;

public class Main {
    public static void main(String[] args) {

        Puntos p1 = new Puntos(3, 4, 5, 6);
        PuntosService ps = new PuntosService();


        System.out.println("La distancia entre los dos puntos es de "+ps.calcularDistancia(p1));
    }
}