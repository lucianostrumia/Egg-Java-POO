import Entidades.Movil;
import Service.MovilService;

public class Main {
    public static void main(String[] args) {

        Movil m1 = new Movil();
        MovilService ms = new MovilService();

        ms.cargarCelular(m1);

        System.out.println(m1.toString());
    }
}