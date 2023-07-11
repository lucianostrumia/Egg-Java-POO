package Service;

import Entidades.NIF;

import java.util.Scanner;

public class NIFService {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void rellenar(NIF n) {

        n.setLetras(0, "T");
        n.setLetras(1, "R");
        n.setLetras(2, "W");
        n.setLetras(3, "A");
        n.setLetras(4, "G");
        n.setLetras(5, "M");
        n.setLetras(6, "Y");
        n.setLetras(7, "F");
        n.setLetras(8, "P");
        n.setLetras(9, "D");
        n.setLetras(10, "X");
        n.setLetras(11, "B");
        n.setLetras(12, "N");
        n.setLetras(13, "J");
        n.setLetras(14, "Z");
        n.setLetras(15, "S");
        n.setLetras(16, "Q");
        n.setLetras(17, "V");
        n.setLetras(18, "H");
        n.setLetras(19, "L");
        n.setLetras(20, "C");
        n.setLetras(21, "K");
        n.setLetras(22, "E");
    }
    public void crearNIF(NIF n) {

        System.out.println("Ingrese numero de DNI");
        n.setDNI(input.nextInt());
        n.setLetra(n.getLetras(n.getDNI()%23));

    }
    public void mostrar(NIF n) {

        System.out.println(n.getDNI()+"-"+n.getLetra());
    }
}
