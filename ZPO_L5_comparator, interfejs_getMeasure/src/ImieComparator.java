import java.util.Comparator;

public class ImieComparator implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista tenisista, Tenisista t1) {
        return tenisista.imie.compareTo(t1.imie);
    }
}
