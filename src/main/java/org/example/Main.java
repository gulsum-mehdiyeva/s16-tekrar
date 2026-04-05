package org.example;

import org.example.company.RaporlayiciSistem;
import org.example.company.umit.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calisan ali      = new Calisan("Ali", 24);
        TakimLideri ayse = new TakimLideri("Ayşe", 31);
        Mudur mehmet     = new Mudur("Mehmet", 39);
        Direktor zeynep  = new Direktor("Zeynep", 46);
        Ceo burak        = new Ceo("Burak", 52);

        Departman yazilim = new Departman("Yazılım Ekibi", Arrays.asList(ali, ayse, mehmet));

        MaasHesaplayici maasServisi   = new StandartMaasHesaplayici();
        Raporlayici     raporServisi  = new RaporlayiciSistem();
        YetkiYoneticisi yetkiServisi  = new YetkiYoneticisi();

        System.out.println("=== " + yazilim.getDepartmanAdi() + " RAPORU ===\n");

        for (Calisan personel : yazilim.getCalisanlar()) {
            double ekBonus = 500.0;

            double toplamMaas = maasServisi.hesapla(personel, ekBonus);

            boolean izinYetkisi  = yetkiServisi.izinOnaylamaYetkisiVarMi(personel);
            boolean raporYetkisi = yetkiServisi.raporOkumaYetkisiVarMi(personel);
            raporServisi.raporVer(personel, toplamMaas);

            System.out.println("İzin Onay Yetkisi: " + (izinYetkisi ? "Var" : " Yok"));
            System.out.println("Rapor Okuma Yetkisi: " + (raporYetkisi ? "Var" : " Yok"));
        }
    }
}