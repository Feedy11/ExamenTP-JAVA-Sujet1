package Examtpsujet1;

public class Theatre extends Evenement {
    private String auteur;

    public Theatre(String titre, int duree, String realisateur, String[] tab, String auteur) {
        super(titre, duree, realisateur, tab);
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return super.toString() + ", Theatre [auteur=" + auteur + "]";
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
