package org.example.company.umit;

import org.example.company.Pozisyon;

public class Mudur extends TakimLideri {
    public Mudur(String isim, int yas) {
        super(isim, yas);
        this.pozisyon = Pozisyon.MUDUR;
    }
}