package Zad3;
import java.util.Arrays;
import java.util.Scanner;

public class Aplikacja {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Wpisz imię");
        String imie = scan.next();
        System.out.println("Wpisz nazwisko");
        String nazwisko = scan.next();
        System.out.println("Wpisz płeć");
        String plec = scan.next();
        System.out.println("Wpisz dzień urodzin");
        int dzien = scan.nextInt();
        System.out.println("Wpisz miesiąc urodzin");
        int miesiac = scan.nextInt();
        System.out.println("Wpisz rok urodzin");
        int rok = scan.nextInt();
        System.out.println("Wpisz wzrost w cm");
        double wzrost = scan.nextDouble();
        System.out.println("Wpisz wagę w kg");
        double waga = scan.nextDouble();

        HealthProfile health= new HealthProfile(imie, nazwisko, plec, dzien, miesiac,rok,wzrost, waga);
        int wiek=health.wiek(20,10,2019);
        double bmi=health.bmi();
        int[] tetna=health.tetnoTarget(wiek);

        System.out.println(wiek);
        System.out.println(bmi);
        System.out.println(Arrays.toString(tetna));
    }

}
