package Examtpsujet1;

import java.util.Arrays;

public class Evenement {
    private String titre;
    private int duree;
    private String realisateur;
    private String[] tab;

    public Evenement(String titre, int duree, String realisateur, String[] tab) {
        this.titre = titre;
        this.duree = duree;
        this.realisateur = realisateur;
        this.tab = tab;
    }

    @Override
    public String toString() {
        return "Evenement [titre=" + titre + ", duree=" + duree + ", realisateur=" + realisateur + "]";
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public boolean acteurIn(String s) {
        for (String acteur : tab) {
            if (acteur.equals(s)) {
                return true;
            }
        }
        return false;
    }
}
