public class Variabile {
    public static void main(String[] args) {
        // declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        // strongly typed - trebuie sa specificam tipurile de variabile

        System.out.println("Am cumparat o masina marca:" + marcaMasina);
        System.out.println("Este modelul marca :" + modelMasina);

        // suprascierea
        modelMasina = "XC 60 facelift";

        System.out.println("Am cumparat o masina marca:" + marcaMasina);
        System.out.println("Este modelul marca :" + modelMasina);

        //declarare
        String nume;
        String prenume;
        Integer varsta;
        // initializare
        prenume = "Mihai";
        nume = "Suciu";
        varsta = 40;
        // concatenare stringuri
        System.out.println("Proprietarul este : " + nume + " " + prenume + " cu varsta de " + varsta);
    }
}
