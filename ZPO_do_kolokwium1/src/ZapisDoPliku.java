import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ZapisDoPliku {
    public static void file(ArrayList<Integer> mecze, String nazwa){

        try (FileWriter writer = new FileWriter(nazwa);
             BufferedWriter bw = new BufferedWriter(writer)) {

            bw.write(String.valueOf(mecze));

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

    }
}
