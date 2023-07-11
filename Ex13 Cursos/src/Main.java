import Entidad.Curso;
import Service.CursoService;

public class Main {
    public static void main(String[] args) {

        Curso c1 = new Curso();
        CursoService cs = new CursoService();

        cs.crearCurso(c1);

        System.out.println(c1.toString());

        System.out.println("Las gananacias semanales con este curso serian de " + cs.calcularGananciasSemanal(c1));
    }
}