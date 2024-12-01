package Examtpsujet1;

public class OrgniseEvtMois {
	private int mois;
	private ThemeEvt theme;
	private Evenement[] tabe;

	public OrgniseEvtMois(int mois, ThemeEvt theme) {
		super();
		this.mois = mois;
		this.theme = theme;
		int nb = nbmax();
		this.tabe = new Evenement[nb];
	}

	public int nbmax() {
		if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
			return 31;
		}
		if (mois == 2) {
			return 28;
		} else {
			return 30;
		}
	}

	void ajouter(Evenement Evt, int jour) throws EvtException {
		if (theme.theme(Evt)) {
			if (jour < 1 || jour > nbmax()) {
				throw new EvtException("jour incorrecte");
			}
			if (tabe[jour - 1] == null) {
				tabe[jour - 1] = Evt;
			} else {
				int i;
				for (i = 0; i < tabe.length; i++) {
					if (tabe[i] == null) {
						tabe[i] = Evt;
						break;
					}
				}
				if (i == nbmax())
					throw new EvtException("complet");

			}
		} else
			System.out.println("hors theme");
	}
	void afficherCalendrierEvts() {
	    for (int i = 0; i < tabe.length; i++) {
	        if (tabe[i] != null) {
	            System.out.println("Jour " + (i + 1) + ": " + tabe[i].toString());
	        } else {
	            System.out.println("Jour " + (i + 1) + ": Aucun événement");
	        }
	    }
	}

}
