import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //wylosuj 10 liczb i zapisz je w tablicy
        int[] wylosowaneLiczby = wylosujLiczbyDoTablicy(10);
        //tablica moze zawierac typy proste i zlozone
        //nie mozna zmieniac w trakcie dzialania programu rozmiaru tablicy
        //wypisywanie tablicy
        wypisz(wylosowaneLiczby);
        //wylosuj 50 liczb bez powtorzen
        ArrayList<Integer> wylosowaneLiczbyLista = losujLiczbyBezPowtorzen(50);
        //ArrayLista - kolekcja
        //musi zawierac typy zlozone czyli pisane z wielkiej litery
        //w trakcie dzialania programu moze sie zmieniac rozmiar kolekcji
        //wypisywanie listy
        wypisz(wylosowaneLiczbyLista);
    }

    static ArrayList<Integer> losujLiczbyBezPowtorzen(int ileLiczb){
        Random random = new Random();
        ArrayList<Integer> wylosowaneLiczby = new ArrayList<>();
        for (int i = 0; i < ileLiczb; i++) {
           int liczba = random.nextInt(100)+1;
           while (wylosowaneLiczby.contains(liczba)){
               liczba = random.nextInt(100)+1;
           }
           wylosowaneLiczby.add(liczba);
        }
        return wylosowaneLiczby;
    }
    //metoda wypisz o tej samej nazwie o różnych argumentach (typ lub liczba argumentow) -> przeciążanie metod

    static void wypisz(int[] tablica){
        System.out.println("Wylosowane liczby:");
        for (int elementTablicy:tablica) {
            //typ nazwaelementu:tablica/kolekcja
            System.out.print(elementTablicy+", ");
        }
    }

    static void wypisz(ArrayList<Integer> lista){
        System.out.println("Lista: ");
        for (int element:lista) {
            System.out.print(element+", ");
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