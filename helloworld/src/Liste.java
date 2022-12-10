import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        //declaram o lista goala
        List<String> fructe = new ArrayList<>();
        // trebuie facute importurile cu Alt+Enter/Alt+Shift+Enter
        // au o dimensiune dinamica
        // mai smart decat array
        // mai exista si alte tipuri de liste

        //adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        //cum se iau elementele
        System.out.println(fructe.get(2));

        // cum se afla indexul unui element
        System.out.println(fructe.indexOf("banana"));

        // scoatem un element
        // fructe.remove(o:"mar"); ---------> nu imi merge sintaxa
        fructe.remove(0); //doar cu sintaxa asta imi merge

        //listam elementele
        System.out.println(Arrays.toString(fructe.toArray()));

        // este lista goala?
        System.out.println(fructe.isEmpty());
        //fructe.clear(); // golim toata lista
        // lista nu este goala?
        if (!fructe.isEmpty()){
            System.out.println("Avem fructe");
        } else {
            System.out.println("Nu avem fructe");
        }
        System.out.println(fructe);

        //aflam dimensiunea listei
        System.out.println(fructe.size());

        // declaram o lista imutabila si o initializam cu valori
        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 44, 77});
        //System.out.println(Arrays.toString(numere.toArray()));//printam lista
        System.out.println(numere);

        //declaram o lista cu size dinamic
        String[] flowers = {"Ageratum", "Allium", "Poppy", "Catmint"};//declaram array
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));//transformam in lista
        flowerList.add("Rose");
        //System.out.println(Arrays.toString(flowerList.toArray()));//printam lista
        System.out.println(flowerList);

        //aflam unde este poppy si il stergem
        int poppyIndex = flowerList.indexOf("Poppy");
        flowerList.remove(poppyIndex);
        //System.out.println(Arrays.toString(flowerList.toArray()));//printam lista
        System.out.println(flowerList);//printam lista mai simplu!!! in versiunile mai noi de Java

    }
}
