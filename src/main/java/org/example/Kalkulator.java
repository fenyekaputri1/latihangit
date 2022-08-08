package org.example;

public class Kalkulator {
    private int angka1;
    private int angka2;
    private int hasil;

    public Kalkulator(int angka1, int angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public int getHasilPerkalian(){
        int hasil = angka1 * angka2;
        return hasil;
    }

    public int getHasilPembagian(){
        int hasil = angka1/angka2;
        return hasil;
    }


}
