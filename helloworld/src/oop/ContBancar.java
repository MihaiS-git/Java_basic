package oop;

public class ContBancar {
    //program files = definim logica unui cont bancar

    // oop = object oriented programming
    // poo = programare orientata pe obiecte

    // o clasa = este un tip nou
    // este definitia unui concept, conceptualizare teoretica a unei entitati practice
    // reteta la paste carbonara, ADN-ul uman
    // ex: clasa Car

    // un obiect = instanta unei clase(implementarea clasei)
    // paste carbonara, un om
    // ex: 10 obiecte de tip Car, toate vor respecta aceeasi regula

    //contine
    // fields = proprietati = atribute
    // adica variabilele
    // ex: masina - culoare, design, marca, model, consum, pret, esteOprita

    //metode - actiuni ce pot fi facute de obiecte
    //functii
    // ex: accelereaza(), franeaza(), deschideUsa(), vopsire()

    //proprietatile/atributele/fieldurile
    String titularCont;
    String iban;
    double sold = 0; // pot pune valoarea ca si int ca se transforma in double
    boolean activ = false;
    private int pin = 7777;
    int incercariActivare = 0;

    //private boolean activ = false; - incapsulation, ascundem pt utilizator cu private

    //constructor = are rolul de a impune date de start
    // constructorul este optional
    //ca si * din formulare, required fields, campuri obligatorii, impune date de start
    // restul datelor sunt optionale

    //click dreapta + generate + constructor + constructori
    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }
    //toate variabilele unei functii "traiesc" doar intre acoladele functiei

    //metode = actiunile clasei
    //nu mai trebuie sa punem "static"
    public void interogareSold() {
        System.out.println("Titular: " + this.titularCont);
        System.out.println("IBAN: " + this.iban);
        System.out.println("Sold: " + this.sold);
        System.out.println("Activ: " + this.activ);
        System.out.println("Nr incercari gresite " + this.incercariActivare);
        System.out.println("---------------------------------");
        // this in loc de cont1 sau cont 2 - "oricare ar fi"

    }
    //metoda activare cont doar daca pin-ul este corect - nu vreau sa returneze nimic
    public void activareCont(int pinUtilizator) {
        //modifica activ in true doar daca pinul e corect
        System.out.println("Buna!" + this.titularCont);
        if (pinUtilizator == this.pin) {
            this.activ = true;
            System.out.println("Cont activat cu succes");
        } else {
            System.out.println("PIN invalid");
            this.incercariActivare++; //incrementare cu +1/decrementare cu --
        }
    }

    public void alimentareCont(double sumaDepusa) {
        //la ce aveam in cont (this.sold) se mai adauga suma depusa
        this.sold = this.sold + sumaDepusa;
        System.out.println("Buna " + this.titularCont + " Depunere cu succes! " + sumaDepusa + "Aveti in cont suma de: " + this.sold);
        System.out.println("                          ");
    }

    public void plataCard(double sumaCheltuita) {
        //cheltuim bani
        System.out.println("Buna " + this.titularCont);
        if (sumaCheltuita <= this.sold) {
            //dispar banii
            this.sold = this.sold - sumaCheltuita;
            System.out.println("Ai cheltuit " + sumaCheltuita);
            System.out.println("Mai ai " + this.sold + " RON in cont");
        } else {
            System.out.println("Fonduri insuficiente!");
        }
    }
}
// inheritance=mosteniri, polimorfism, incapsulation, abstractisation - la curs