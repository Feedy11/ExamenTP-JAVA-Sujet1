package Examtpsujet1;

public class MainEx {
    public static void main(String[] args) {
        try {
            ThemeArtiste ta = new ThemeArtiste("Mohamed");
            String tArtistes1[] = {"Ahmed", "Salah", "Mohamed"};
            String tArtistes2[] = {"Sana", "Imene", "Mouna"};
            OrgniseEvtMois MJuillet = new OrgniseEvtMois(7, ta);

            Evenement e1 = new Film("Film1", 2, "Sami", tArtistes1, "Youssef", "Action");
            Evenement e2 = new Film("Film2", 1, "Dalel", tArtistes2, "Asma", "Drame");
            Evenement e3 = new Theatre("Theatre1", 3, "Nour", tArtistes1, "Mohamed");

            MJuillet.ajouter(e1, 5);
            MJuillet.ajouter(e2, 10);
            MJuillet.ajouter(e3, 15);

            MJuillet.afficherCalendrierEvts();
        } catch (EvtException e) {
            System.out.println(e.getMessage());
        }
    }
}
