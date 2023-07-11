import Entidades.Matematica;
import Servicio.MatematicaServicio;

public class Main {
    public static void main(String[] args) {

        Matematica m1 = new Matematica();
        m1.setNum1(Math.random()*10);
        m1.setNum2(Math.random()*10);

        MatematicaServicio ms = new MatematicaServicio();

        System.out.println("El primer numero es "+m1.getNum1()+" y el segundo es "+m1.getNum2()+".");

        System.out.println("El numero mas grande es "+ms.devolverMayor(m1));

        System.out.println("El mayor de los numeros, elevado al menor, da como resultado: "+ms.calcularPotencia(m1));

        System.out.println("La raiz cuadrada del menor de los numeros es "+ms.calcularRaiz(m1));
    }
}