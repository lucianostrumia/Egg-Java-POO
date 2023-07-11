import Entidades.Raices;
import Service.RaicesService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los 3 numeros a usar como coeficientes:");
        Raices r1 = new Raices(input.nextInt(), input.nextInt(), input.nextInt());
        RaicesService rs = new RaicesService();

        rs.calcular(r1);


    }
}