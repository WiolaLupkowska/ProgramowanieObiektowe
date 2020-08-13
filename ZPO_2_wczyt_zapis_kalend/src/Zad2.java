import java.time.DayOfWeek;
import java.time.LocalDate;

public class Zad2 {


        public static void kalendarz(int miesiac, int rok)
        {
            String dniTyg="Mon Tue Wed Thu Fri Sat Sun";
            LocalDate ld = LocalDate.of(rok, miesiac, 1);
            DayOfWeek jakiDzienTygodnia=ld.getDayOfWeek();
            StringBuilder sb = new StringBuilder("");
            int nrDniaTyg=ld.getDayOfWeek().getValue();
            int nrDniaTygtemp=nrDniaTyg;

            do{
                sb.append("    ");
                nrDniaTygtemp--;
            }while(nrDniaTygtemp!=1);

            do {
                if(ld.getDayOfMonth()<10){
                    sb.append("  "+ld.getDayOfMonth()+" ");
                    if(ld.getDayOfWeek().getValue()==7) {
                        sb.append("\n");
                    }
                    ld = ld.plusDays(1);
                }
                else{
                sb.append(" "+ld.getDayOfMonth()+" ");
                    if(ld.getDayOfWeek().getValue()==7) {
                        sb.append("\n");
                    }
                    ld = ld.plusDays(1);
                }
            } while (ld.getDayOfMonth() > 1);  // 1 wyzej ,potem dodane, nastepny miesiac zacznie sie od 1, wiec juz go nie wyswietli
            System.out.println(dniTyg);
            System.out.println(sb);
        }

    public static void main(String[] args) {
        kalendarz(10,1762);
    }
}
