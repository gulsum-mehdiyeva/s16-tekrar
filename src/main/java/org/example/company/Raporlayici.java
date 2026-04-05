package org.example.company;

import org.example.company.umit.Calisan;
import org.example.company.umit.SirketPersoneli;

public class Raporlayici {
    public void raporVer(SirketPersoneli personel, double toplamMaas) {
        if (personel == null) {
            System.out.println("Geçersiz çalışan bilgisi.");
            return;
        }
        if (personel.getPozisyon() == null) {
            System.out.println("Pozisyon bilgisi tanımlanmamış.");
            return;
        }

        System.out.println("İsim: " + personel.getIsim() +
                " | Yaş: " + personel.getYas() +
                " | Ünvan: " + personel.getPozisyon().getUnvan() +
                " | Toplam Maaş: " + toplamMaas + " TL");
    }
}