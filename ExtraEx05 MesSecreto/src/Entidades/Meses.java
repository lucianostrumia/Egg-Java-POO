package Entidades;

public class Meses {

    private String[] anio = new String[12];
    private String mesSecreto;

    public Meses() {
    }

    public String getAnio(int pos) {
        return anio[pos];
    }

    public void setAnio(int pos, String m) {
        anio[pos] = m;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
}
