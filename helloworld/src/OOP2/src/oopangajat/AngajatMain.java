package oopangajat;

public class AngajatMain {
    public static void main(String[] args) {
        // initializam obiecte de tip Anagajat
        Angajat ang1 = new Angajat("Suciu","Mihai",3000,10,"inginer");
        Angajat ang2 = new Angajat("Pop","Ion",1000,2,"dulgher");
        Angajat ang3 = new Angajat("Promoroaca","Costel",1600,17,"fierar");
        Angajat ang4 = new Angajat("Sofronie","Alexandru",2000,21,"betonist");

        //apelam metoda CMAngajat
        ang1.CMAngajat();
        ang2.CMAngajat();
        ang3.CMAngajat();
        ang4.CMAngajat();

        System.out.println("----------------------");

        //apelam metoda MarireSalariu
        ang1.MarireSalariu();
        ang2.MarireSalariu();
        ang3.MarireSalariu();
        ang4.MarireSalariu();

        //apelam metoda CMAngajat
        ang1.CMAngajat();
        ang2.CMAngajat();
        ang3.CMAngajat();
        ang4.CMAngajat();

        System.out.println("----------------------");

        double FondSalarii = ang1.salariu + ang2.salariu + ang3.salariu + ang4.salariu;
        System.out.println("Suma salariilor este: " + FondSalarii);
    }
}
