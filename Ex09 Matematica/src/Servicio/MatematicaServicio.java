package Servicio;

import Entidades.Matematica;

public class MatematicaServicio {

    public int devolverMayor(Matematica m) {

        return Math.max(Math.toIntExact(Math.round(m.getNum1())), Math.toIntExact(Math.round(m.getNum2())));
    }
    public double calcularPotencia(Matematica m) {
        double num1 = Math.round(m.getNum1());
        double num2 = Math.round(m.getNum2());

        if (num1 > num2) {
            return Math.pow(num1, num2);
        } else {
            return Math.pow(num2, num1);
        }
    }
    public double calcularRaiz(Matematica m) {
        double num1 = Math.abs(m.getNum1());
        double num2 = Math.abs(m.getNum2());

        if (num1 < num2) {
            return Math.sqrt(num1);
        } else {
            return Math.sqrt(num2);
        }
    }

}
