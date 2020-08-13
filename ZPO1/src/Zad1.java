public class Zad1 {
    public static double podatek(int dochod){
        if (dochod<11000)
            return 0;
        else if(dochod >= 11000 && dochod<18000)
            return dochod*0.25;
        else if(dochod >= 18000 && dochod<31000)
            return dochod*0.35;
        else if(dochod >= 31000 && dochod<60000)
            return dochod*0.42;
        else if(dochod >= 60000 && dochod<90000)
            return dochod*0.48;
        else if(dochod >= 90000 && dochod<1000000)
            return dochod*0.50;
        else
            return 0.55;
    }

    public static void main(String[] args) {
        System.out.println(podatek(50000));
    }

}
