package org.example.company;

import org.example.company.umit.Calisan;

public class Raporlayici {
    public void raporVer(Calisan calisan, double maas) {
        if (calisan == null) {
            System.out.println("Geçersiz çalışan bilgisi.");
            return;
        }
        if (calisan.getPozisyon() == null) {
            System.out.println("Pozisyon bilgisi tanımlanmamış.");
            return;
        }

        System.out.println("İsim: " + calisan.getIsim() +
                " | Yaş: " + calisan.getYas() +
                " | Ünvan: " + calisan.getPozisyon().getUnvan() +
                " | Toplam Maaş: " + maas + " TL");
    }
}