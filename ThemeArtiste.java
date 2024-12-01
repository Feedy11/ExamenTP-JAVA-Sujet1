package Examtpsujet1;

public class ThemeArtiste implements ThemeEvt {
    private String artistex;

    public ThemeArtiste(String artistex) {
        this.artistex = artistex;
    }

    @Override
    public boolean theme(Evenement Evt) {
        if (Evt instanceof Theatre) {
            return ((Theatre) Evt).getAuteur().equals(artistex) ||
                   Evt.getRealisateur().equals(artistex) ||
                   Evt.acteurIn(artistex);
        } else if (Evt instanceof Film) {
            return ((Film) Evt).getProducteur().equals(artistex) ||
                   Evt.getRealisateur().equals(artistex) ||
                   Evt.acteurIn(artistex);
        }
        return false;
    }
}
