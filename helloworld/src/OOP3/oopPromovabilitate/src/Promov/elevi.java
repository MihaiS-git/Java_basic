package Promov;
public class elevi {
    String nume;
    String initiala;
    String prenume;
    String datan;
    double mediaLiceu = 0;
    double mediaBac = 0;
    double media = 0;

    String promovat;

    public elevi(String nume, String initiala, String prenume, String datan, double mediaLiceu, double mediaBac) {
        this.nume = nume;
        this.initiala = initiala;
        this.prenume = prenume;
        this.datan = datan;
        this.mediaLiceu = mediaLiceu;
        this.mediaBac = mediaBac;
    }

    public void afisCatalog() {
        System.out.println("Elev: " + this.nume + this.initiala + this.prenume);
        System.out.println("Data nasterii: " + this.datan);
        System.out.println("Media anilor de liceu: " + this.mediaLiceu);
        System.out.println("Media BAC: " + this.mediaBac);
        System.out.println("Media generala: " + mediaGenerala(media));
    }

    public double mediaGenerala(double media) {
        media = (this.mediaLiceu + this.mediaBac) / 2;
        return media;
    }

    public void promEl() {
        if ((this.mediaBac<6) || (this.mediaLiceu<5)){
            System.out.println("NEPROMOVAT");
        } else {
            System.out.println("PROMOVAT");
        }
    }
}

