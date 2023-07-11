package Service;

import Entidad.Curso;
import java.util.Scanner;

public class CursoService {
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void cargarAlumnos(Curso c){
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre del alumno n° "+(i+1));
            String nom = input.nextLine();
            c.setAlumnos(i,nom);
        }
    }
    public void crearCurso(Curso c) {

        System.out.println("Ingrese el nombre del curso:");
        c.setNombreCurso(input.next());
        System.out.println("Ingrese la cantidad de horas por dia");
        c.setCantHorasPorDia(input.nextInt());
        System.out.println("Ingrese la cantidad de dias a la semana");
        c.setCantDiasPorSemana(input.nextInt());
        System.out.println("Ingrese el turno de cursado");
        c.setTurno(input.next());
        System.out.println("Ingrese el precio por hora");
        c.setPrecioPorHora(input.nextInt());
        input.nextLine();
        cargarAlumnos(c);
    }
    public int calcularGananciasSemanal(Curso c){

        return c.getCantDiasPorSemana()*c.getCantHorasPorDia()*c.getPrecioPorHora()*c.getAlumnos().length;
    }


}
