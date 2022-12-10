import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class Maps {
    public static void main(String[] args) {
        //reprezentare de date in sistem cheie valoare
        // exemplu: gigel are nota 10, costel are nota 9

        //declaram un Map
        Map<String,Integer> noteElevi=new HashMap<String,Integer>();

        //adaugam elemente
        noteElevi.put("Gigel",10);
        noteElevi.put("Costel",9);
        noteElevi.put("Ana",10);

        //aflu notele
        System.out.println("Ana are nota: " + noteElevi.get("Ana"));

        //suprascriere Costel si-a marit nota
        noteElevi.replace("Costel", 5);
        System.out.println("Noua nota a lui Costel: " + noteElevi.get("Costel"));
        System.out.println(noteElevi);

        // dimensiunea
        System.out.println(noteElevi.size());

        //stergem valori
        noteElevi.remove("Gigel");
        System.out.println(noteElevi);
        System.out.println(noteElevi.get("Gigel"));

        //declaram si initializam cu valori
        //map nu este ordonat
        Map<String,Integer> luni = new HashMap<String,Integer>();
        {{
            put("Jan", 1);
            put("Feb", 2);
            put("Mar", 3);
        }}
        System.out.println(luni);// nu merge!!!
    }
}
