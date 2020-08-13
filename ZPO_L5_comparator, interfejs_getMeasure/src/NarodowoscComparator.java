import java.util.Comparator;

class NarodowoscComparator implements  Comparator<Tenisista> {

    @Override
    public int compare(Tenisista tenisista, Tenisista t1) {
        return tenisista.narodowosc.compareTo(t1.narodowosc);
    }
}
