package Entidades;

import java.util.Date;
import java.util.PrimitiveIterator;

public class Persona {

    private String nombre;
    private Date fechaDeNac = new Date();

    public Persona() {
    }

    public Persona(String nombre, Date fechaDeNac) {
        this.nombre = nombre;
        this.fechaDeNac = fechaDeNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNac() {
        return fechaDeNac;
    }

    public void setFechaDeNac(int dia, int mes, int anio) {
        this.fechaDeNac.setDate(dia);
        this.fechaDeNac.setMonth(mes-1);
        this.fechaDeNac.setYear(anio);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeNac=" + fechaDeNac +
                '}';
    }
}
