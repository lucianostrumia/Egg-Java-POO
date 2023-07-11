package Service;

import Entidades.Ahorcado;

import java.util.Scanner;

public class AhorcadoService {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void crearJuego(Ahorcado a) {

        System.out.println("Ingrese la palabra");
        String palabra = input.next();
        a.setCantJugadasMaximas(7);
        a.setArray(palabra.length());

        for (int i = 0; i < palabra.length(); i++) {
            if (i == 0) {
                a.setLetrasArray(i, palabra.substring(i, i + 1).toUpperCase());
            } else {
                a.setLetrasArray(i, palabra.substring(i, i + 1));
            }
        }
    }

    public void longitud(Ahorcado a) {

        System.out.println("La palabra tiene " + a.getArray().length + " letras. Buena suerte!");
    }

    //Algunos de los metodos solicitados en el ejercicio eran muy cortos, redundantes o estaban muy relacionados uno
    //con el otro, por lo que fueron condensados en uno solo aqui:

    public void buscarLetra(Ahorcado a, String l, String[] aux) {

        boolean seEncuentra = false;

        for (int i = 0; i < a.getArray().length; i++) {
            if (a.getLetraArray(i).equalsIgnoreCase(l)) {
                aux[i] = a.getLetraArray(i);
                seEncuentra = true;
            }
        }
        if (seEncuentra) {
            System.out.println("La letra esta en la palabra!");
        } else {
            System.out.println("La letra no se encuentra en la palabra");
            a.setCantJugadasMaximas(a.getCantJugadasMaximas() - 1);
        }
        System.out.println("La palabra es:");
        System.out.print("[");
        for (int j = 0; j < aux.length; j++) {
            if (aux[j] == null && j == aux.length - 1) {
                System.out.print("_");
            } else if (aux[j] == null) {
                System.out.print("_,");
            } else if (j == aux.length - 1) {
                System.out.print(aux[j]);
            } else {
                System.out.print(aux[j] + ",");
            }
        }
        System.out.println("]");
        if (a.getCantJugadasMaximas() > 0) {
            System.out.println("Te quedan " + a.getCantJugadasMaximas() + " intentos.");
        }
    }

    public void juego(Ahorcado a) {

        crearJuego(a);
        longitud(a);

        String[] palabraAux = new String[a.getArray().length];
        String letraIngresada;
        boolean lleno = true;


        while (a.getCantJugadasMaximas() > 0) {
            System.out.println("Ingresa una letra");
            letraIngresada = input.next();

            buscarLetra(a, letraIngresada, palabraAux);
            lleno = true;
            for (int i = 0; i < palabraAux.length; i++) {
                if (palabraAux[i] == null) {
                    lleno = false;
                    break;
                }
            }
            imagenAhorcado(a.getCantJugadasMaximas());
            if (lleno) {
                break;
            }
        }
        System.out.println("");
        if (lleno) {
            System.out.println("FELIITACIONES! Adivinaste la palabra");
        } else {
            System.out.println("Te quedaste sin intentos, perdiste :(");
        }
    }

    public void imagenAhorcado(int num) {
        if (num == 6) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (num == 5) {
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (num == 4) {
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (num == 3) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (num == 2) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (num == 1) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (num == 0) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
    }
}
