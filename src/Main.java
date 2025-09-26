import java.util.*;

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
        //wylosuj 30 liczb bez powtorzen ->zbiory
        //HashSet zbiory - kolekcja, elementy się nie powtarzają, nie sa indeksowane, nieuporządkowane
        HashSet<Integer> liczbyWylosowane = losujLiczbyBezPowtorzenDoZbioru(30);
        wypisz(liczbyWylosowane);

        //metoda do wczytywania listy elementow z klawiatury
        ArrayList<Integer>wczytane =wczytajLiczbyZKlawiatury(5);

        //wypisz wczytane elementy
        wypisz(wczytane);
    }

    static ArrayList<Integer> wczytajLiczbyZKlawiatury(int ileLiczb){
        ArrayList<Integer> wczytaneLiczby = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ileLiczb; i++) {
            System.out.println("Podaj liczbę nr "+(i+1));
            int liczba = scanner.nextInt();
            wczytaneLiczby.add(liczba);
        }

        return wczytaneLiczby;
    }


    static HashSet<Integer> losujLiczbyBezPowtorzenDoZbioru(int ileLiczb){
        HashSet<Integer> wylosowaneLiczby = new HashSet<>();
        Random random = new Random();
        while (wylosowaneLiczby.size()<ileLiczb){
            wylosowaneLiczby.add(random.nextInt(100)+1);
        }
        return wylosowaneLiczby;
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
        System.out.println("Wypisywanie 2 sposobem");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    static void wypisz(HashSet<Integer> lista){
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