import Entidades.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta();

        crearCuenta(cuenta1);

        consultarDatos(cuenta1);

        extraccionRapida(cuenta1);

        consultarSaldo(cuenta1);
    }

    public static void crearCuenta(Cuenta cta) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero de cuenta");
        cta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI del usuario");
        cta.setDNI(leer.nextInt());
        System.out.println("Ingrese el saldo actual");
        cta.setSaldoActual(leer.nextInt());
    }

    public static void ingresarSaldo(Cuenta cta) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad a agregar");;
        int a = leer.nextInt() + cta.getSaldoActual();
        cta.setSaldoActual(a);
    }

    public static void retirarSaldo(Cuenta cta) {
        Scanner leer = new Scanner(System.in);

            System.out.println("Ingrese el monto a retirar");
            int a = leer.nextInt();
            int b = cta.getSaldoActual();

            if (a > cta.getSaldoActual()) {
                System.out.println("El monto ingresado es superior al saldo restante, usted puede retirar hasta " + cta.getSaldoActual() + ".");
            } else {
                cta.setSaldoActual(b - a);
            }

    }

    public static void extraccionRapida(Cuenta cta) {
        Scanner leer = new Scanner(System.in);

            System.out.println("Ingrese el monto a extraer, solo puede retirar el 20% del saldo restante");
            int a = leer.nextInt();
            int b = cta.getSaldoActual();

            if (a > b*0.2) {
                System.out.println("El monto supera el 20%, no se puede realizar la accion");
            } else {
                cta.setSaldoActual(b-a);
            }

    }

    public static void consultarSaldo(Cuenta cta) {

        System.out.println("Su saldo restante es "+cta.getSaldoActual());
    }

    public static void consultarDatos(Cuenta cta) {

        System.out.println("Numero de cuenta: "+cta.getNumeroCuenta());
        System.out.println("Numero de DNI: "+cta.getDNI());
        System.out.println("Saldo actual: "+cta.getSaldoActual());
    }
}