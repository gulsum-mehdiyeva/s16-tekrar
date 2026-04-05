package org.example.company.umit;

import org.example.company.Pozisyon;

public class Direktor extends Mudur {
    public Direktor(String isim, int yas) {
        super(isim, yas);
        this.pozisyon = Pozisyon.DIREKTOR;
    }
}