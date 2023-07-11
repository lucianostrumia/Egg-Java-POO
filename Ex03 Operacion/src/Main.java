import Entidades.Operacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operacion op1 = new Operacion();

        crearOperacion(op1);

        System.out.println("El resultado de los numeros sumados es " + sumar(op1));
        System.out.println("El resultado de los numeros restados es " + restar(op1));
        System.out.println("El resultado de los numeros multiplicados es " + multiplicar(op1));
        System.out.println("El resultado de los numeros divididos es " + division(op1));
    }

    public static void crearOperacion (Operacion op) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero 1");
        op.setNum1(leer.nextInt());
        System.out.println("Ingrese el numero 2");
        op.setNum2(leer.nextInt());
    }

    public static int sumar(Operacion op) {
        return op.getNum1() + op.getNum2();
    }

    public static int restar(Operacion op) {
        return op.getNum1() - op.getNum2();
    }

    public static int multiplicar(Operacion op) {

        if (op.getNum1() == 0 || op.getNum2() == 0) {
            System.out.println("Uno de los numeros es 0, por lo que el resultado siempre sera 0");
            return 0;
        } else {
            return op.getNum1() * op.getNum2();
        }
    }

    public static int division(Operacion op) {

        if (op.getNum1() == 0 || op.getNum2() == 0) {
            System.out.println("Uno de los numeros es 0, por lo que el resultado siempre sera 0");
            return 0;
        } else {
            return op.getNum1() / op.getNum2();
        }
    }

}