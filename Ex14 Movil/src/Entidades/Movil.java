package Entidades;

import java.util.Arrays;

public class Movil {

    private String marca;
    private String modelo;
    private double precio;
    private int memoriaRam;
    private int almacenamiento;
    private int[] codigo = new int[7];

    public Movil() {
    }

    public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int pos, int num) {
        codigo[pos] = num;
    }

    @Override
    public String toString() {
        return "Movil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", memoriaRam=" + memoriaRam +
                ", almacenamiento=" + almacenamiento +
                ", codigo=" + Arrays.toString(codigo) +
                '}';
    }
}