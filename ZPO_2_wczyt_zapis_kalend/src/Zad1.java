
import java.io.*;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class Zad1 {




    public static void main(String[] args) throws FileNotFoundException {
        String zrodlo = "plik.txt";
        ArrayList<Integer> numer = new ArrayList<>();
        ArrayList<String> kraj = new ArrayList<>();
        ArrayList<String> imie = new ArrayList<>();
        ArrayList<Integer> wiek = new ArrayList<>();
        ArrayList<Integer> punkty = new ArrayList<>();
        ArrayList<Integer> turnieje = new ArrayList<>();
        try {
            String source = zrodlo;
            File file = new File(source);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linia = null;
            while ((linia = br.readLine()) != null) {
                String [] elementy = linia.split("\t");
                numer.add(Integer.parseInt(elementy[0]));
                kraj.add(elementy[1]);
                imie.add(elementy[2]);
                wiek.add(Integer.parseInt(elementy[3]));
                punkty.add(Integer.parseInt(elementy[4]));
                turnieje.add(Integer.parseInt(elementy[5]));
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("błąd we/wy");
        }

        //a
        System.out.println("Na jakie pozycji jest Goffin?");
        double pozycja = numerPozycji(imie, "Goffin" );
        System.out.println(pozycja);
        System.out.println();


        //b
        System.out.println("Ilu graczy w top50 z HUN?");
        int ileGraczy=top50(kraj, "HUN" );
        System.out.println(ileGraczy);
        System.out.println();

        //c
        double[] wynik=sredniaOdchylenie(wiek);
        System.out.println("średnia i odchylenie:");
        System.out.println(Arrays.toString(wynik));
        System.out.println();

        //d
        System.out.println("różnica:");
        double roznica=roznica(5,30,punkty);
        System.out.println(roznica);
        System.out.println();

        //e
        file(turnieje, "turnieje.txt");




    }

    /**
     * Fukcja z parametrami- zwraca numer pozycji zawodnika o zadanym nazwisku.
     * @param nazwisko nazwisko zawodnika (typ String)
     * @param nazw lista z imionami oraz nazwiskami zawodników (typ String)
     * @return pozycja
     */

    public static int numerPozycji(ArrayList<String> nazwisko, String nazw) {
        int pozycja=0;
        for (int i=0;i<50; i++){
            if (nazwisko.get(i).contains(nazw)){
                pozycja=i;
            }
        }
        return pozycja;
    }

    /**
     * Funkcja z parametrami- zwraca liczbę zawodników w top50 z danego kraju.
     * @param kraje lista z krajami (typ String)
     * @param kraj (typ String)
     * @return
     */
    public static int top50 (ArrayList<String> kraje, String kraj) {
        int ile=0;
        for (int i=0; i<50;i++){
            if( kraje.get(i).equals(kraj)){
                ile+=1;
            }
        }
        return ile;
    }

    /**
     * Funkcja z parametrami- znajduje odchylenie standardowe oraz średnią z wieku uczestników. Wyniki zwraca do tablicy z 2 polami.
     * @param wiek lista z wiekiem uczestnikow (typ int)
     * @return stdMean- tablica z wynikami
     */
    public static double[] sredniaOdchylenie (ArrayList<Integer> wiek) {
        double std=0;
        double mean=0;
        int suma=0;
        double stdSuma=0;
        double [] stdMean= new double[2];

            for(int lata: wiek){
                suma+=lata;
                mean=suma/wiek.size();
            }

            for( int lata:wiek){
                stdSuma+=(lata-mean)*(lata-mean);
            }
         std=Math.sqrt(stdSuma/wiek.size());

         stdMean[0]=mean;
         stdMean[1]=std;

        return stdMean;
    }

    /**
     * Funkcja z parametrami- zwraca różnicę między wynikami dwóch zawodników o zadanych numerach.
     * @param numerZawodnika1 (typ int)
     * @param numerZawodnika2 (typ int)
     * @param punkty lista (typ int)
     * @return roznica (typ int)
     */
        public static int roznica(int numerZawodnika1, int numerZawodnika2,  ArrayList<Integer> punkty){
            int roznica= Math.abs(punkty.get(numerZawodnika1)-punkty.get(numerZawodnika2));
            return roznica;
        }

    /**
     *Funckja z parametrami- zapisuje ilości turniejów do pliku
     * @param mecze lista (typ int)
     * @param nazwa nazwa pliku (typ String)
     */
    public static void file(ArrayList<Integer> mecze, String nazwa){

            try (FileWriter writer = new FileWriter(nazwa);
                 BufferedWriter bw = new BufferedWriter(writer)) {

                bw.write(String.valueOf(mecze));

            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }

        }


}






