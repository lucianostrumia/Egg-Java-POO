package Service;

import Entidades.Raices;

public class RaicesService {

    public double getDiscriminante(Raices r) {

        return Math.pow(r.getB(),2)-(4*r.getA()*r.getC());
    }
    public boolean tieneRaices(Raices r) {

        return getDiscriminante(r) > 0;
    }
    public boolean tieneRaiz(Raices r) {

        return getDiscriminante(r) == 0;
    }
    public boolean obtenerRaices(Raices r){

        if (tieneRaices(r)) {
            double raiz1 = (-r.getB()+Math.sqrt(Math.pow(r.getB(),2)-(4*r.getA()*r.getC())))/(2*r.getA());
            double raiz2 = (-r.getB()-Math.sqrt(Math.pow(r.getB(),2)-(4*r.getA()*r.getC())))/(2*r.getA());

            System.out.println("La raiz numero 1 es "+raiz1);
            System.out.println("La raiz numero 2 es "+raiz2);
            return true;
        } else {
            return false;
        }
    }
    public boolean obtenerRaiz(Raices r) {

        if (tieneRaiz(r)) {

            double raiz = (-r.getB()+Math.sqrt(Math.pow(r.getB(),2)-(4*r.getA()*r.getC())))/(2*r.getA());
            System.out.println("Solo tiene una solucion posible, y es: "+raiz);
            return true;
        } else {
            return false;
        }
    }
    public void calcular(Raices r) {

        boolean metodo1 = obtenerRaices(r);
        boolean metodo2 = obtenerRaiz(r);

        if (metodo1 == false && metodo2 == false) {
            System.out.println("No tiene solucion posible");
        }
    }
}
