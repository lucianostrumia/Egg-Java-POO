package Entidades;

public class NIF {

    private int DNI;
    private String letra;
    private String[] letras = new String[23];

    public NIF() {
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getLetras(int pos) {
        return letras[pos];
    }

    public void setLetras(int pos, String l) {
        letras[pos] = l;
    }
}
