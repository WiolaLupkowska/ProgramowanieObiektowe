import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WczytywanieTenisisci {

    public static void main(String[] args) throws FileNotFoundException {
        String zrodlo = "C:\\Users\\wiole_5ewf698\\IdeaProjects\\ZPO_L5\\src\\plik.txt";
        List<Tenisista> tenisisci = new ArrayList<>();
        Tenisista t;
        Tenisista temp;
        String [] imieNazwisko;

        try {
            String source = zrodlo;
            File file = new File(source);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linia = null;
            while ((linia = br.readLine()) != null) {
                String[] elementy = linia.split("\t");
                imieNazwisko= (elementy[2].split(" "));
                t= new Tenisista(Integer.parseInt(elementy[0]), elementy[1].toString(), imieNazwisko[0], imieNazwisko[1], Integer.parseInt(elementy[3]), Integer.parseInt(elementy[4]), Integer.parseInt(elementy[5])) {
                };
                tenisisci.add(t);
                //System.out.println(tenisisci);
            }

        } catch(IOException e){
            e.printStackTrace();
            System.out.println("błąd we/wy");
        }

}
