package Zad3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class HealthProfile {
    String imie;
    String nazwisko;
    String plec;
    int dzien;
    int miesiac;
    int rok;
    double wzrost;
    double masa;

    /**
     * Konstruktor z parametrami- tworzy obiekt klasy HealthProfile z zadanymi parametrami
     * @param imie (typ String)
     * @param nazwisko (typ String)
     * @param plec (typ String)
     * @param dzien (typ int)
     * @param miesiac (typ int)
     * @param rok (typ int)
     * @param wzrost (typ double)
     * @param masa (typ double)
     */
    public HealthProfile(String imie, String nazwisko, String plec, int dzien, int miesiac, int rok, double wzrost, double masa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
        this.wzrost = wzrost;
        this.masa = masa;
    }

    /**
     * Funkcja dająca dostęp do wartości atrybutu klasy imie.
     * @return
     */
    public String getImie() {
        return imie;
    }

    /**
     *Fukcja z parametrem, ustawia atrybut klasy- imie na zadaną wartość.
     * @param imie (typ String)
     */
    public void setImie(String imie) {
        this.imie = imie;
    }

    /**
     *Funkcja dająca dostęp do wartości atrybutu klasy nazwisko.
     * @return
     */
    public String getNazwisko() {
        return nazwisko;
    }

    /**
     *Fukcja z parametrem, ustawia atrybut klasy- nazwisko na zadaną wartość.
     * @param nazwisko (typ String)
     */
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    /**
     * Funkcja dająca dostęp do wartości atrybutu klasy plec.
     * @return
     */
    public String getPlec() {
        return plec;
    }

    /**
     * Fukcja z parametrem, ustawia atrybut klasy- plec na zadaną wartość.
     * @param plec (typ String)
     */
    public void setPlec(String plec) {
        this.plec = plec;
    }

    /**
     * Funkcja dająca dostęp do wartości atrybutu klasy dzien.
     * @return
     */
    public int getDzien() {
        return dzien;
    }

    /**
     *Fukcja z parametrem, ustawia atrybut klasy- dzien na zadaną wartość.
     * @param dzien (typ int)
     */
    public void setDzien(int dzien) {
        this.dzien = dzien;
    }

    /**
     * Funkcja dająca dostęp do wartości atrybutu klasy- miesiac.
     * @return
     */
    public int getMiesiac() {
        return miesiac;
    }

    /**
     * Fukcja z parametrem, ustawia atrybut klasy- miesiac na zadaną wartość.
     * @param miesiac
     */
    public void setMiesiac(int miesiac) {
        this.miesiac = miesiac;
    }

    /**
     * Funkcja dająca dostęp do wartości atrybutu klasy- rok.
     * @return
     */
    public int getRok() {
        return rok;
    }

    /**
     * Fukcja z parametrem, ustawia atrybut klasy- rok na zadaną wartość.
     * @param rok (typ int)
     */
    public void setRok(int rok) {
        this.rok = rok;
    }

    /**
     * Funkcja dająca dostęp do wartości atrybutu klasy- wzrost.
     * @return
     */
    public double getWzrost() {
        return wzrost;
    }

    /**
     * Fukcja z parametrem, ustawia atrybut klasy- wzrost na zadaną wartość.
     * @param wzrost (typ double)
     */
    public void setWzrost(double wzrost) {
        this.wzrost = wzrost;
    }

    /**
     * Funkcja dająca dostęp do wartości atrybutu klasy- masa.
     * @return
     */
    public double getMasa() {
        return masa;
    }

    /**
     * Fukcja z parametrem, ustawia atrybut klasy- masa na zadaną wartość.
     * @param masa (typ double)
     */
    public void setMasa(double masa) {
        this.masa = masa;
    }

    /**
     * Funkcja z parametrami, wylicza wiek.
     * @param dzienDzis (typ int)
     * @param miesiacDzis (typ int)
     * @param rokDzis (typ int)
     * @return
     */
    public int wiek(int dzienDzis, int miesiacDzis, int rokDzis) {
        Period wiek=Period.between(LocalDate.of(this.rok,this.miesiac,this.dzien), LocalDate.of(rokDzis,miesiacDzis,dzienDzis));
        int lata=wiek.getYears();
        return lata;
    }

    /**
     * Funkcja przyjmująca za parametr wiek, wylicza tetno max i docelowe.
     * @param wiek (typ int)
     * @return
     */
    public static int[] tetnoTarget(int wiek){
        int[] target=new int[2];
        target[0]= (int)((200-wiek)*0.5);
        target[1]=(int)((200-wiek)*0.7);
        return target;
    }
    /**
     * Funkcja wyliczająca bmi.
     * @return
     */
    public double bmi(){
        double bmi=this.masa/(this.wzrost*this.wzrost/100);
        return bmi;
    }

    public static void main(String[] args) {

    }


}
