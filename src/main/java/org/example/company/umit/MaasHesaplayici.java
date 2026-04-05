package org.example.company.umit;

import org.example.company.Pozisyon;

public class MaasHesaplayici {
    public double hesapla(Calisan calisan, double ekBonus) {
        Pozisyon p = calisan.getPozisyon();
        return p.getBazMaas() + p.getVarsayilanBonus() + ekBonus;
    }
}