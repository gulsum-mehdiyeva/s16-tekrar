package org.example.company;

public enum Pozisyon {
    CALISAN("Çalışan", 4000, 0),
    TAKIM_LIDERI("Takım Lideri", 7000, 500),
    MUDUR("Müdür", 10000, 1000),
    DIREKTOR("Direktör", 15000, 2000),
    CEO("Ceo", 50000, 5000);

    private final String unvan;
    private final double bazMaas;
    private final double varsayilanBonus;

    Pozisyon(String unvan, double bazMaas, double varsayilanBonus) {
        this.unvan = unvan;
        this.bazMaas = bazMaas;
        this.varsayilanBonus = varsayilanBonus;
    }
    public String getUnvan() { return unvan; }
    public double getBazMaas() { return bazMaas; }
    public double getVarsayilanBonus() { return varsayilanBonus; }
}