import Entidades.Ahorcado;
import Service.AhorcadoService;

public class Main {
    public static void main(String[] args) {

        Ahorcado a1 = new Ahorcado();
        AhorcadoService as = new AhorcadoService();

        as.juego(a1);
    }
}