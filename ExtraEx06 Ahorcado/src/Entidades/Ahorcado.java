package Entidades;

import java.util.Arrays;

public class Ahorcado {

    private String[] array;
    private int cantLetrasEncontradas;
    private int cantJugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] array, int cantLetrasEncontradas, int cantJugadasMaximas) {
        this.array = array;
        this.cantLetrasEncontradas = cantLetrasEncontradas;
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    public String[] getArray() {
        return array;
    }
    public String getLetraArray(int pos) {
        return array[pos];
    }

    public void setArray(int letras) {
        array = new String[letras];
    }
    public void setLetrasArray(int pos, String letra){
        array[pos] = letra;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getCantJugadasMaximas() {
        return cantJugadasMaximas;
    }

    public void setCantJugadasMaximas(int cantJugadasMaximas) {
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" +
                "array=" + Arrays.toString(array) +
                ", cantLetrasEncontradas=" + cantLetrasEncontradas +
                ", cantJugadasMaximas=" + cantJugadasMaximas +
                '}';
    }
}

