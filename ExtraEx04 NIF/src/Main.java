import Entidades.NIF;
import Service.NIFService;

public class Main {
    public static void main(String[] args) {

        NIF n1 = new NIF();
        NIFService ns = new NIFService();

        ns.rellenar(n1);
        ns.crearNIF(n1);

        ns.mostrar(n1);

    }
}