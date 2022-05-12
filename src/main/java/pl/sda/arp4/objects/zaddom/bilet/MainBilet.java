package pl.sda.arp4.objects.zaddom.bilet;

import java.util.Scanner;

public class MainBilet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RodzajBiletu typ = null;
        System.out.println("Rodzaje biletu: ");
        for (RodzajBiletu rodzaj : RodzajBiletu.values()) {
            System.out.print(rodzaj + ", ");
        }
        System.out.println();
        do {
            System.out.println("Podaj rodzaj biletu który chcesz: ");
            String rodzajString = scanner.next();
            try {
                typ = RodzajBiletu.valueOf(rodzajString.toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.out.println("Nie ma takiego biletu");
            }
        } while (typ == null);

        System.out.println("Wybrałeś bilet " + typ + " : " + typ.cena + " PLN");
        System.out.println("Ile chciałbyś kupić biletów?");
        int liczbaBiletow = scanner.nextInt();
        System.out.println("Do zapłaty: " + (liczbaBiletow * typ.cena) + " PLN");
    }
}


