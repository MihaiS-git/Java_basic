package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // desktop

        // initializam obiecte de tip ContBancar
        // instante ale clasei ContBancar
        ContBancar cont1 = new ContBancar("Mihai S","RO001");
        ContBancar cont2 = new ContBancar("Ion P","RO002");

//        //apelam metoda "descriere"
//        cont1.descriere(); // nu vrea parametri pentru ca noi stim toate datele din interior
//        cont2.descriere();

        //activam conturile si le mai afisam inca o data
        cont1.activareCont(7777);
        cont2.activareCont(3333);
        cont2.activareCont(2222);
        cont2.activareCont(7777);
        System.out.println("+++++++++++++++++++++++++++");
        //alimentam contul
        cont1.alimentareCont(350);
        cont2.alimentareCont(1000);
        cont2.alimentareCont(1500);
        System.out.println("+++++++++++++++++++++++++++");

        //negative testing, cheltuim mai mult decat avem
        cont1.plataCard(350); // corect
        cont1.plataCard(50);

        //positive cu suma exacta
        cont2.plataCard(2000); //corect
        cont2.plataCard(200);

        System.out.println("+++++++++++++++++++++++++++");
        //facem descrierea conturilor
        cont1.interogareSold();
        cont2.interogareSold();
    }
}
