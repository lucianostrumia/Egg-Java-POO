import Entidades.Libro;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    Libro primerLibro = new Libro();

    cargarLibro(primerLibro);

    imprimirLibro(primerLibro);

    }

    public static void cargarLibro(Libro libro) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero de ISBN");
        libro.setISBN(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese el titulo del libro");
        libro.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor");
        libro.setAutor(leer.nextLine());
        System.out.println("Ingrese la cantidad de paginas");
        libro.setNumeroDePaginas(leer.nextInt());
    }

    public static void imprimirLibro(Libro libro) {

        System.out.println("ISBN: "+ libro.getISBN());
        System.out.println("Nombre del libro: "+ libro.getTitulo());
        System.out.println("Autor: "+ libro.getAutor());
        System.out.println("Cantidad de paginas: "+ libro.getNumeroDePaginas());


    }

}

