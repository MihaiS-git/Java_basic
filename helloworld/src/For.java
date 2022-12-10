import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class For {
    public static void main(String[] args) {
        // for - loop
        // de unde incepem?
        // pana unde mergem?
        // pasul de parcurgere

        // problema: printam 101 dalmatieni
        //System.out.println("dalmatianul 1", "dalmatianul 2"...);
        for (int i = 1; i<=101; i++){
            System.out.println("Dalmatianul cu numarul " + i);
        }

        // ne ajuta sa parcurgem un array prin intermediul indexului
        int[] numere = {3, 7, 10, 20, 30, 100};
        for(int i = 0; i < numere.length; i++) {
            System.out.println("elementul are index " + i + " si valoarea " + numere[i]);
        }
//      // trick indexare din 2in2, 3in3, etc.
//      int[] numere = {3, 7, 10, 20};
//      for(int i = 0; i < numere.length; i+=2){
//      System.out.println("elementul are index " + i + " si valoarea " + numere[i]);

        // for each - parcurge elementele din array si ajunge direct la valoare fara indexare
        for (int nr : numere) {
            System.out.println("Numarul este : " + nr);
        }

        // suma numerelor din array
        int s = 0;
        for (int nr : numere) { //s=3, +7, +10, +...
            s = s + nr;
        }
        System.out.println("Suma array este " + s);
        System.out.println("   ");

        //parcurgem array de culori
        String[] culori = {"alb", "rosu", "galben"};
        for (String culoare : culori){
            System.out.println("Culoarea actuala este : " + culoare);
        }
        System.out.println(' ');

       // de cate ori apare 3 in [3, 2, 4, 3, 14, 5]
        List<Integer> numere2 = Arrays.asList(new Integer[]{3, 2, 4, 3, 14, 5, 3, 3});
        int a = 0;
        for (int nr : numere2){
            if (nr == 3) {
                a = a +1;
            }
        }
        System.out.println("3 apare in tablou de " + a + " ori");
    }
}
