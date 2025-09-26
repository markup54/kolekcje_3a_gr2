import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //wylosuj 10 liczb i zapisz je w tablicy
        int[] wylosowaneLiczby = wylosujLiczbyDoTablicy(10);
        //wypisywanie tablicy
        wypiszTablice(wylosowaneLiczby);
    }

    static void wypiszTablice(int[] tablica){
        System.out.println("Wylosowane liczby:");
        for (int elementTablicy:tablica) {
            //typ nazwaelementu:tablica/kolekcja
            System.out.print(elementTablicy+", ");
        }
    }

    static int[] wylosujLiczbyDoTablicy(int ileLiczb)
    {
        Random random = new Random();
        int[] tablicaLosowych = new int[ileLiczb];
        for (int i = 0; i < tablicaLosowych.length; i++) {
            tablicaLosowych[i] = random.nextInt(100)+1;
        }
       return tablicaLosowych;
    }
}