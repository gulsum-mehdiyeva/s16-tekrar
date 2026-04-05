package org.example.company.umit;
import org.example.company.Pozisyon;

public class TakimLideri extends Calisan {
    public TakimLideri(String isim, int yas) {
        super(isim, yas);
        this.pozisyon = Pozisyon.TAKIM_LIDERI;
    }
}