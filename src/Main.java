import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //wylosuj 10 liczb i zapisz je w tablicy
        int[] wylosowaneLiczby = new int[10];//tablica w momencie utworzenia musi mieć podany rozmiar
        Random random =new Random();
        for (int i = 0; i < wylosowaneLiczby.length; i++) {
            wylosowaneLiczby[i] = random.nextInt(1,101);
        }
        //wypisywanie tablicy
        System.out.println("Wylosowane liczby:");
        for (int elementTablicy:wylosowaneLiczby) {
            //typ nazwaelementu:tablica/kolekcja
            System.out.print(elementTablicy+", ");
        }
    }
}