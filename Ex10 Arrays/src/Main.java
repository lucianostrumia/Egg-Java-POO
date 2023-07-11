import Entidades.Arreglos;
import Arreglos.ArreglosServicios;

public class Main {
    public static void main(String[] args) {

        Arreglos array = new Arreglos();
        ArreglosServicios ar = new ArreglosServicios();

        ar.rellenarArray(array);

        for (int i = 0; i < array.getArray1().length; i++) {
            System.out.println(array.getArray1()[i]);
        }

        System.out.println("");

        ar.ordenarArray(array);
        ar.copiarArray(array);
        ar.completarArray(array);

        for (int i = 0; i < array.getArray1().length; i++) {
            System.out.println(array.getArray1()[i]);
        }
        System.out.println("");

        for (int i = 0; i < array.getArray2().length; i++) {
            System.out.println(array.getArray2()[i]);
        }

    }
}