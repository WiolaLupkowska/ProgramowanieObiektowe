import java.io.*;
import java.util.ArrayList;

public class WczytywanieZPliku {
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
                String[] elementy = linia.split("\t");
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
    }

}
