public class Array {
    public static void main(String[] args) {
        // declarare si initializare
        String[] elevi = {"Gigel", "Costel", "Mari", "Ela", "Ada"};
        int[] numere = {1, 33, 81, 99, 201};
        // contine mai multe elemente de acelasi tip
        //accesam elementele prin index care incepe de la 0
        //are o dimensiune fixa, nu mai putem adauga elemente
        // are propietatea leght sau size care ne da dimensiunea array-ului

        System.out.println(elevi[1]);
        System.out.println(numere[3]);
        elevi[2] = "Sebi";
        System.out.println(elevi[2]);
        System.out.println(elevi.length);
        System.out.println(elevi[4]); // referire statica

        //putem sa ne jucam cu valorile din spate
        System.out.println(elevi[0] + " " + elevi[1]); // "Gigel" + "Costel"
        System.out.println(elevi.length + 5);
        System.out.println(elevi[elevi.length-1] + " " + elevi[elevi.length-2]); //Ada + Ela
        System.out.println(numere[numere.length-1] + " " + numere[numere.length-2]); // referire dinamica

        // declarare si alocare de memorie
        int[] note = new int[5]; // 0, 0, 0, 0, 0
        System.out.println(note[1]);
        note[0] = 10;
        note[1] = 7;
        note[2] = 5;
        note[3] = 3;
        note[4] = 9;
        System.out.println(note[4]);
    }
}
