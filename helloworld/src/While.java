public class While {
    public static void main(String[] args) {
        // While  - loop, ciclu repetitiv
        // zona de cod care se repeta atat timp cat o conditie e true

        // problema: masina merge cat timp inca are benzina
        int benzina = 10;
        System.out.println("Ai in rezervor: " + benzina + " litri");
        while (benzina > 0) {
            benzina = benzina - 1;
            System.out.println("Vrum! Vrum! mai ai in rezervor: " + benzina + " litri");
            // sub 3 litri aprindem atentionam
            if (benzina <=3 ){
                System.out.println("ATENTIE!");
            }
        }
        System.out.println("STOP!!! Nu mai ai benzina!!!");
    }
}
