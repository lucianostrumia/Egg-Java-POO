package Service;

import Entidades.Movil;

import java.util.Scanner;

public class MovilService {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void cargarCelular(Movil m) {

        System.out.println("Ingresar marca");
        m.setMarca(input.next());
        System.out.println("Ingresar modelo");
        m.setModelo(input.next());
        System.out.println("Ingresar precio");
        m.setPrecio(input.nextDouble());
        System.out.println("Ingresar memoria RAM");
        m.setMemoriaRam(input.nextInt());
        System.out.println("Ingresar almacenamiento");
        m.setAlmacenamiento(input.nextInt());

        for (int i = 0; i < m.getCodigo().length; i++) {
            m.setCodigo(i, ingresarCodigo(m));
        }
    }

    private int ingresarCodigo(Movil m) {

        int cifra;
        System.out.println("Ingrese el codigo, una cifra a la vez");
        cifra = input.nextInt();
        if (cifra > 9) {
            System.out.println("El numero ingresado tiene mas de una cifra, por favor ingrese una a la vez");
            cifra = input.nextInt();
        }
        return cifra;
    }
}
