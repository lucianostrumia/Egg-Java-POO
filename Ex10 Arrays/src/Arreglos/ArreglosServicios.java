package Arreglos;

import Entidades.Arreglos;

import java.util.Arrays;


public class ArreglosServicios {

    public void rellenarArray(Arreglos a) {

        for (int i = 0; i < a.getArray1().length; i++) {
               double num = Math.random()*10;
            a.setArray1(num, i);
        }
    }
    public void ordenarArray(Arreglos a) {

        Arrays.sort(a.getArray1());
    }
    public void copiarArray(Arreglos a) {
        for (int i = 0; i < 10; i++) {
            a.setArray2(a.getIndiceArray1(i), i);
        }
    }
    public void completarArray(Arreglos a) {

        Arrays.fill(a.getArray2(), 10, 20, 0.5);
    }

}
