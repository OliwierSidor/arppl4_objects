package pl.sda.arp4.objects.string;
//Napisz aplikację która przyjmuje od użytkownika tekst, a następnie dzieli go na poszczególne słowa.
// Następnie aplikacja zlicza ilości wystąpień słów. Np. dla tekstu
//        ala lubi koty, ale ala nie jest przez koty lubiana
//        ala - 2
//        lubi - 1
//        koty - 2
//        ale - 1
//        nie - 1
//        jest - 1
//        przez - 1
//        lubiana - 1

import java.util.Scanner;

public class MainZadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst w którym chcesz zliczyć słowa: ");

        String tekst = scanner.nextLine();
        tekst = tekst.replaceAll(",", "");
        String[] slowa = tekst.split(" ");

        for (String s: slowa){
            System.out.println(s);
        }
    }
}

