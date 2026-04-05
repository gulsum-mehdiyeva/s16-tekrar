package org.example.company.umit;

import org.example.company.Pozisyon;

public class YetkiYoneticisi {

    public boolean izinOnaylamaYetkisiVarMi(SirketPersoneli personel) {
        Pozisyon pozisyon = personel.getPozisyon();
        return pozisyon == Pozisyon.MUDUR || pozisyon == Pozisyon.DIREKTOR || pozisyon == Pozisyon.CEO;
    }

    public boolean raporOkumaYetkisiVarMi(SirketPersoneli personel) {
        Pozisyon pozisyon = personel.getPozisyon();
        return pozisyon == Pozisyon.TAKIM_LIDERI ||
                pozisyon == Pozisyon.MUDUR ||
                pozisyon == Pozisyon.DIREKTOR ||
                pozisyon == Pozisyon.CEO;
    }

}