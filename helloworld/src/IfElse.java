import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
//        //Flow control - if else
//        //               evalueaza conditii si bifurca codul in functie de rezultat
//        System.out.println("pornim radio");
//        //daca imi place piesa dau mai tare
//        boolean piesaFaina = false; // invat calculatorul daca piesa e faina sau nu
//        //daca piesa e frumoasa, dau mai tare
//        if (piesaFaina == true) {
//            System.out.println("Dau mai tare");
//            System.out.println("Si incep sa fredonez");
//        }
//        System.out.println("Oprim radio");

        /*
        if else
        daca numarul este par printam acest lucru
        altfel printam impar
         */

//        int nr = 50;
//        if (nr % 2 == 0) {
//            System.out.println("Numar par");
//        }else{
//            System.out.println("Numar impar");
//        }
//        //este numarul pozitiv?
//        if (nr > 0) {
//            System.out.println("Numar pozitiv");
//        } else {
//            System.out.println("Numarul nu este pozitiv");
//        }

        // if, else if, else
        // luam date de la tastatura
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introdu ora: ");
//        int ora = sc.nextInt();
//
//        if ((ora < 0) || (ora > 24)) {
//            System.out.println("Ora introdusa este gresita!");
//        } else if (ora <=11) {
//                System.out.println("Buna dimineata!");
//        } else if (ora < 19) {
//                System.out.println("Buna ziua!");
//        } else {
//            System.out.println("Buna seara!");
//        }

        // exercitiu <0 marsarier, 0 - stationeaza, < 50 in localitate, <90 drum national, >90 autostrada

        // flow control
        // switch - se foloseste cand stim valorile posibile
        System.out.println("alege optiunea");
        Scanner sc = new Scanner(System.in);
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("Meniu anterior");
                break;
            case 1:
                System.out.println("Ai ales limba romana");
                break;
            case 2:
                System.out.println("Ai ales limba engleza");
                break;
            default:
                System.out.println("nu am identificat optiunea! mai incearca!");

        }
        // exercitiu alege piese CD

    }//inchide functia main
}//inchide clasa
