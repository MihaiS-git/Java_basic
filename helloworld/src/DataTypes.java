public class DataTypes {
    public static void main(String[] args) {
        // cele mai folosite 5 tipuri de date

        // string = sir de caractere delimitate de ""
        String marca = "Dacia";
        String model = "1310";

        // scriem cu litere mari
        System.out.println("Marca este : " + marca.toUpperCase() + " Modelul este : " + model);
        //string lenght
        System.out.println(marca.length());

        // integer = numar intreg
        int anFabricatie = 1987;
                System.out.println("Anul de fabricatie este : " + anFabricatie);

        // double = numar zecimal; exista si float dar are mai putine zecimale
        double pret = 1000.99;
        System.out.println("Pretul este : " + pret + " RON");

        // boolean = adevarat sau fals
        boolean inmatriculata = false;
            //boolean inmatriculata = false;
        System.out.println("Masina este inmatriculata : " + inmatriculata);

        //char - un singur caracter
        char nota = 'A';
        System.out.println("Nota masinii este : " + nota);

    }
}
