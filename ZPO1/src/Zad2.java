public class Zad2 {
    public static void main(String[] args) {

        wylosowana();
        lamanie("woLs");

    }

    public static char wylosowana(){
        char wylosowana;
        char [] tablica  = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','q','p','r','s','t','u','w','x','y','z'};
        int random = (int)(Math.random() * 24 + 1);
        //System.out.println(random);
        wylosowana= tablica[random];
        System.out.println(wylosowana);
        return wylosowana;

    }

    public static String lamanie(String haslo){
        int dlugoscHasla= haslo.length();
        //System.out.println("dł   "+dlugoscHasla);
        String zgadniete="";
        for(int i=0; i< dlugoscHasla; i++){

            char litera;
            char sprawdzane=haslo.charAt(i);
            if (sprawdzane!=wylosowana.toLowerCase()) //TO LOWER CASE
            do{
                litera=wylosowana();
            }
            while(haslo.charAt(i) != litera);
            //System.out.println(haslo.charAt(i));

            zgadniete=zgadniete+litera;
            System.out.println("zgadniete   "+zgadniete);

//            if(haslo.charAt(i)==wylosowana()){
////                char litera=wylosowana();
////                zgadniete=zgadniete+litera;
////           }
        }
        zgadniete=zgadniete.toUpperCase();
        System.out.println("zgadniete!   "+zgadniete);
        return zgadniete;
    }




}
