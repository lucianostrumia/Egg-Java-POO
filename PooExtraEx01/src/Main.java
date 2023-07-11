import Entidades.Vehiculo;

public class Main {
    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo();
        Vehiculo v3 = new Vehiculo();

        v1.setMarca("Peugeot"); v1.setModelo("208"); v1.setAnio(2020); v1.setTipo("auto");
        v2.setMarca("Honda"); v2.setModelo("Titan"); v2.setAnio(2022); v2.setTipo("moto");
        v3.setMarca("Treker"); v3.setModelo("Tania"); v3.setAnio(2021); v3.setTipo("bicicleta");

        System.out.println("Si los vehiculos se moviesen por 5 segundos, el auto avanzaria "+Moverse(v1, 5)+" metros, la moto avanzaria "+Moverse(v2, 5)+" metros y la bicicleta "+Moverse(v3, 5)+" metros.");
        System.out.println("Si los vehiculos se moviesen por 10 segundos, el auto avanzaria "+Moverse(v1, 10)+" metros, la moto avanzaria "+Moverse(v2, 10)+" metros y la bicicleta "+Moverse(v3, 10)+" metros.");
        System.out.println("Si los vehiculos se moviesen por 60 segundos, el auto avanzaria "+Moverse(v1, 60)+" metros, la moto avanzaria "+Moverse(v2, 60)+" metros y la bicicleta "+Moverse(v3, 60)+" metros.");

        int mov5minsV1 = Moverse(v1, 300);
        int mov5minsV2 = Moverse(v2, 300);
        int mov5minsV3 = Moverse(v3, 300);

        System.out.println("");
        System.out.println("");

        if (mov5minsV1 > mov5minsV2 && mov5minsV1 > mov5minsV3) {
            System.out.println("El vehiculo que mas lejos llego en 5 minutos es " + v1.getMarca()+" "+v1.getModelo()+", modelo "+v1.getAnio() + ", que recorrio "+mov5minsV1+" metros.");
        } else if (mov5minsV2 > mov5minsV1 && mov5minsV2 > mov5minsV3) {
            System.out.println("El vehiculo que mas lejos llego en 5 minutos es " + v2.getMarca()+" "+v2.getModelo()+", modelo "+v2.getAnio() + ", que recorrio "+mov5minsV2+" metros.");
        } else {
            System.out.println("El vehiculo que mas lejos llego en 5 minutos es " + v3.getMarca()+" "+v3.getModelo()+", modelo "+v3.getAnio() + ", que recorrio "+mov5minsV3+" metros.");
        }

    }

    public static int Moverse(Vehiculo v, int tiempo) {
        int metros = 1;
        if (v.getTipo().equals("auto")) {
            metros = (tiempo * 3) + Frenar(v);
        } else if (v.getTipo().equals("moto")) {
            metros = (tiempo * 2) + Frenar(v);
        } else if (v.getTipo().equals("bicicleta")) {
            metros = (tiempo * 1) + Frenar(v);
        }
        return metros;
    }

    public static int Frenar(Vehiculo v) {
        if (v.getTipo().equals("bicicleta")) {
            return 0;
        } else {
            return 2;
        }
    }
}