public class Functii {
    // functie - logica delimitata care poate fi folosita
    //nu putem folosi spatii in nume
    // nu putem defini o functie in alta functie

    // in context de programare bazat pe obiecte - metoda

    // o functie simpla care printeaza ceva pe ecran
    // nu ne da nici un raspuns(nu are return)
    // nu are parametri

    // public ca se poate accesa din orice clasa
    // static ca nu e in contextul de programare cu obiecte
    // void ca nu ne da nici un raspuns
    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit!");
    }

    // o functie care saluta clientul in functie de numele lui
    // are nevoie de parametri
    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua, " + nume + " " + prenume +"!");
    }

    // o functie care calculeaza media a 3 numere
    // ne da un raspuns - suma numerelor. va avea return
    // ce tip de date va avea raspunsul? 3+5/2 -> double
    // are nevoie de parametri
    public static double mediaNr(double a, double b, double c) {
        double media = (a + b + c)/3;
        return media;
    }

    // o functie care ne da valoarea lui pi
    // ne da un raspuns
    // ce tip de date va avea raspunsul? -> double
    // nu are nevoie de parametri
    public static double piValue () {
        //return 3.14;
        //sau
        //double pi = 3.14;

        //constanta - variabila care nu poate fi suprascrisa/se scrie cu litere mari
        final double PI = 3.14;
        return PI;
    }

    public static void main(String[] args) {
        // intra clientul 1
        printGreeting(); // se apeleaza functia
        // cu() functie / fara () variabila

        //intra clientul 2
        printGreeting(); //Ctrl+click pe functie ne duce la corpul ei

        // apelam o functie cu parametri oferind argumente
        printGreetingByName("Mihai", "Pop");
        printGreetingByName("Ionel", "Prunean");
        printGreetingByName("Vasile", "Muresan");

        System.out.println(" ");

        System.out.println(mediaNr(1,3,4));
        double media1 = mediaNr(2155,5666,899);
        double media2 = mediaNr(155,566,899);
        double media3 = mediaNr(2155.5,666,899);
        System.out.println("Media 1 este:" + media1);
        System.out.println("Media 2 este:" + media2);
        System.out.println("Media 3 este:" + media3);

        System.out.println(" ");

        System.out.println("Valoarea lui PI este " + piValue());

        //tema: aria unui dreptunghi, suma 2 numere, arie cerc
        // o functie care returneaza cate caractere are numele + prenumele
        String nume = "Pop";
        String prenume = "Mihai";
        System.out.println(nume.length()+prenume.length());

    }
}
