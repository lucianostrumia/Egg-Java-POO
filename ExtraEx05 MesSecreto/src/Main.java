import Entidades.Meses;
import Service.MesesService;

public class Main {
    public static void main(String[] args) {

        Meses m1 = new Meses();
        MesesService ms = new MesesService();

        ms.rellenar(m1);

        ms.adivinar(m1);
    }
}