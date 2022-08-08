package org.example;

public class Square {
    private int sisi;

    //this disini akan membaca variabel dideklarasi class
    public Square(int sisi){
        this.sisi = sisi;
    }

    public int getSisi() {
        return this.sisi*this.sisi;
    }
}
