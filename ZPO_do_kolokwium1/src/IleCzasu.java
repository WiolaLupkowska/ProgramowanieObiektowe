import java.time.LocalDate;
import java.time.Period;

public class IleCzasu {

    private LocalDate dataZatrudnienia;
    private LocalDate rokProdukcji;

    public int stazPracy(){
        LocalDate now= LocalDate.now();
        Period period=Period.between(dataZatrudnienia,now);
        int staz=period.getDays();
        return staz;
    }



    public int wiekPojazdu(){
        LocalDate now= LocalDate.now();
        Period period=Period.between(now, this.rokProdukcji);
        return period.getYears();
    }
}
