package pl.sda.arp4.objects.zaddom.bilet;

public enum RodzajBiletu {
    NORMALNY(1.70),
    ULGOWY(0.90),
    EMERYT(0.30),
    CALODOBOWY(5.30);
    double cena;

    RodzajBiletu(double cena) {
        this.cena = cena;
    }
}
