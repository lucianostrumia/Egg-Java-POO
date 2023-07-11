package Entidades;

public class Arreglos {

    public double array1[] = new double[50];
    public double array2[] = new double[20];

    public double[] getArray1() {
        return array1;
    }

    public void setArray1(double value, int pos) {
        this.array1[pos] = value;
    }

    public double[] getArray2() {
        return array2;
    }

    public void setArray2(double value, int pos) {
        this.array2[pos] = value;
    }
    public double getIndiceArray1(int pos) {
        return array1[pos];
    }
}

