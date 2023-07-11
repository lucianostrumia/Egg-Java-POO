package Service;

import Entidades.Puntos;

public class PuntosService {

    public double calcularDistancia(Puntos p) {

        return Math.sqrt(Math.pow((p.getX2()-p.getX1()),2) + Math.pow((p.getY2()-p.getY1()),2));
    }
}
