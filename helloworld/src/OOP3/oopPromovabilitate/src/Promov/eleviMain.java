package Promov;

public class eleviMain {
    public static void main(String[] args) {
        elevi Elev1 = new elevi("Ionescu ", "M. ", "Pavel","05.06.1985", 10, 10);
        elevi Elev2 = new elevi("Gheorghe ", "A. ", "Ioana","22.11.1985", 7, 6.25);
        elevi Elev3 = new elevi("Pastrav ", "C. ", "Mircea","15.04.1985", 4,5);
        elevi Elev4 = new elevi("Avadanii ", "D. ", "Sorin","17.08.1985",6,5);

        Elev1.afisCatalog();
        Elev1.promEl();
        System.out.println("--------------------");
        Elev2.afisCatalog();
        Elev1.promEl();
        System.out.println("--------------------");
        Elev3.afisCatalog();
        Elev1.promEl();
        System.out.println("--------------------");
        Elev4.afisCatalog();
        Elev1.promEl();
        System.out.println("--------------------");
    }
}
