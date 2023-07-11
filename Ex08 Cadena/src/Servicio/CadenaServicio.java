package Servicio;

import Entidades.Cadena;

import java.util.Scanner;

public class CadenaServicio {

    private Scanner input = new Scanner(System.in);

    public int mostrarVocales(Cadena c) {
        int cantVocales = 0;

        for (int i = 0; i < c.getLongitud(); i++ ) {
            char letra = c.getFrase().charAt(i);
            if (Character.toString(letra).equalsIgnoreCase("a") || Character.toString(letra).equalsIgnoreCase("e") || Character.toString(letra).equalsIgnoreCase("i") || Character.toString(letra).equalsIgnoreCase("o") || Character.toString(letra).equalsIgnoreCase("u")) {
                cantVocales++;
            }
        }
        return cantVocales;
    }
    public String invertirFrase(Cadena c){
        String revertida = "";

        for (int i = c.getLongitud()-1; i >= 0; i--) {
            revertida = revertida.concat(Character.toString(c.getFrase().charAt(i)));
        }

        return revertida;
    }
    public void vecesRepetido(Cadena c, String letra) {
        int cont = 0;

        for (int i = 0; i < c.getLongitud(); i++ ) {
            if (Character.toString(c.getFrase().charAt(i)).equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        System.out.printf("La letra "+letra+" se repite "+cont+" veces.");
    }
    public String compararLongitud(Cadena c) {

        System.out.println("Ingrese una nueva frase para comparar la longitud");
        String nuevaFrase = input.nextLine();

        if (c.getLongitud() > nuevaFrase.length()) {
            return "menor";
        } else {
            return "mayor";
        }
    }
    public String unirFrases(Cadena c) {

        String frasesUnidas = "";
        System.out.println("Ingrese una nueva frase para ser unida a la frase anterior");
        frasesUnidas = c.getFrase().concat(input.nextLine());

        return frasesUnidas;
    }
    public String reemplazar(String frase, String letra) {

        String fraseReemplazada = frase.replace("a", letra);
        return fraseReemplazada;
    }
    public boolean contiene(Cadena c) {

        System.out.println("Ingrese una letra a ser buscada en la frase");

        if (c.getFrase().contains(input.nextLine())) {
            return true;
        } else {
            return false;
        }
    }

}
