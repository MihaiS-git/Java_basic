package oopangajat;

public class Angajat {
    //atribute
    String Nume;
    String Prenume;
    double salariu = 0;
    double vechime = 0;
    String functie;
    boolean activ = false;

    //constructor
    public Angajat(String Nume, String Prenume, double salariu, double vechime, String functie) {
        this.Nume = Nume;
        this.Prenume = Prenume;
        this.salariu = salariu;
        this.vechime = vechime;
        this.functie = functie;
    }

    //metode
    public void CMAngajat() {
        System.out.println("Angajat:");
        System.out.println("--------");
        System.out.println("Nume: " + this.Nume);
        System.out.println("Prenume: " + this.Prenume);
        System.out.println("Functie: " + this.functie);
        System.out.println("Vechime: " + this.vechime);
        System.out.println("Salariu: " + this.salariu);
        System.out.println("------------------------");
    }

    public void MarireSalariu() {
        if ((this.vechime >= 5) && (this.vechime < 10)) {
            this.salariu = this.salariu + 250;
        }
        if ((this.vechime >= 10) && (this.vechime < 15)) {
            this.salariu = this.salariu + 500;
        }
        if (this.vechime >= 15) {
            this.salariu = this.salariu + 1000;
        }
    }
}
