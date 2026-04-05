package org.example.company.umit;

import org.example.company.Pozisyon;

public class StandartMaasHesaplayici implements MaasHesaplayici {
    public double hesapla(SirketPersoneli personel, double ekBonus) {
        Pozisyon p = personel.getPozisyon();
        return p.getBazMaas() + p.getVarsayilanBonus() + ekBonus;
    }
}