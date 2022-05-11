package pl.sda.arp4.objects.zaddom.bilet;

import java.util.Scanner;

public class MainBilet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bilet typ = null;
        for (Bilet rodzaj : Bilet.values()) {
            System.out.println(rodzaj);
        }

        do {
            System.out.println("Podaj rodzaj biletu: ");
            String rodzajString = scanner.next();
            try {
                typ = Bilet.valueOf(rodzajString.toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.err.println("Nie ma takiego biletu");
            }
        } while (typ == null);

        System.out.println("Wybrałeś bilet " + typ + " : " + typ.cena + " PLN");
        System.out.println("Ile chciałbyś kupić biletów?");
        int liczbaBiletow = scanner.nextInt();
        System.out.println("Do zapłaty: " + (liczbaBiletow * typ.cena));
    }
}


