package pl.sda.arp4.objects.zaddom.obywatel;

public class Obywatel {
    private Plec plec;
    private String imie;
    private String nazwisko;
    private long pesel;

    public Obywatel(Plec plec, String imie, String nazwisko, long pesel) {
        this.plec = plec;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Obywatel{" +
                "plec=" + plec +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    public void przedstawSie() {
        System.out.println("Jestem " + plec + " Nazywam się " + imie + " " + nazwisko + ", legitymuję się nr PESEL " + pesel);
    }
}