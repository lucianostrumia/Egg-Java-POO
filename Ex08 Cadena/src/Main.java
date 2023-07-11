import Entidades.Cadena;
import Servicio.CadenaServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cadena c1 = new Cadena();
        CadenaServicio sm = new CadenaServicio();

        System.out.println("Ingrese una frase o palabra");
        c1.setFrase(input.nextLine());
        c1.setLongitud(c1.getFrase().length());

        System.out.println("La frase contiend "+sm.mostrarVocales(c1)+" vocales.");
        System.out.println("La frase invertida se leeria: "+sm.invertirFrase(c1));

        System.out.println("Ingrese una letra para ver cuantas veces se repite en la frase");
        String l = input.nextLine();
        sm.vecesRepetido(c1, l);
        System.out.println("");

        System.out.println("La nueva frase ingresada es "+sm.compararLongitud(c1)+" que la anterior.");
        String fraseUnida = sm.unirFrases(c1);
        System.out.println(fraseUnida);

        System.out.println("Ingrese un caracter con el que reemplazaremos las letras 'a' dentro de la frase");
        String l2 = input.nextLine();

        System.out.println("La frase ahora quedaria: "+sm.reemplazar(fraseUnida, l2));
        System.out.println("");

        boolean contiene = sm.contiene(c1);
        System.out.println("La letra esta contenida, "+contiene);
    }
}
