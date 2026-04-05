package org.example.company.umit;

import org.example.company.Pozisyon;

public class Ceo extends Direktor {
    public Ceo(String isim, int yas) {
        super(isim, yas);
        this.pozisyon = Pozisyon.CEO;
    }
}