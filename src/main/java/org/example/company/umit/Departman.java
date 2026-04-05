package org.example.company.umit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Departman {
    private final String departmanAdi;
    private final List<Calisan> calisanlar;


    public Departman(String departmanAdi, List<Calisan> calisanlar) {
        this.departmanAdi = departmanAdi;

        if (calisanlar != null) {
            this.calisanlar = new ArrayList<>(calisanlar);
        } else {
            this.calisanlar = new ArrayList<>();
        }
    }

    public String getDepartmanAdi() {
    return departmanAdi;
}
    public List<Calisan> getCalisanlar() {
        return Collections.unmodifiableList(calisanlar);
    }
    public void calisanEkle(Calisan yeniCalisan){

        if(yeniCalisan!=null){
            calisanlar.add(yeniCalisan);
        }
    }
}
