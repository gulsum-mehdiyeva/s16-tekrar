package org.example.company.umit;

import org.example.company.Pozisyon;

public class SirketPersoneli extends Insan {
    protected Pozisyon pozisyon;

    public SirketPersoneli(String isim, int yas, Pozisyon pozisyon) {
        super(isim, yas);
        this.pozisyon = pozisyon;
    }
    public Pozisyon getPozisyon() { return pozisyon; }
}