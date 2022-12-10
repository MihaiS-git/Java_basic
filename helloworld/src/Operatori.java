/*
Recap:
variabile
tipuri de date: char, string, integer, boolean, double
*/

/* Operatori
Aritmetici: +,-,*,/,%
De comparare: <, >, == egal, != diferit, >=, <=
Logici: && (and), || (or), !

Flow control - if else
               evalueaza conditii si bifurca codul in functie de rezultat
 */

public class Operatori {
    public static void main(String[] args) {
        int a = 3; //declarare && initializare
        int b = 5;
        a = b; //suprascriere
        System.out.println(a == b); //a=b?
        System.out.println(7>b && 8>b); //7>b si 8>b?
        System.out.println(7>b && 3>b); //7>b si 3>b?
        System.out.println(7>b || 3>b); //7>b sau 3>b?
        System.out.println(7>b && 8>b || 3>b); //7>b si 8>b sau 3>b?
        System.out.println(!(7>b)); //cu ! se inverseaza raspunsul !="not"

        //if else



    }

}
