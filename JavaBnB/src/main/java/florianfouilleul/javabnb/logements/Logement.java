package florianfouilleul.javabnb.logements;

import florianfouilleul.javabnb.utilisateurs.Hote;
import florianfouilleul.javabnb.utilisateurs.Personne;

public class Logement {

    protected Hote hote;
    protected int tarifParNuit;
    protected String adresse;
    protected int superficie;
    protected int nbVoyageursMax;

    public Logement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax) {
        this.hote = hote;
        this.tarifParNuit = tarifParNuit;
        this.adresse = adresse;
        this.superficie = superficie;
        this.nbVoyageursMax = nbVoyageursMax;
    }

    public Logement(Hote hote, String adresse, int superficie) {
        this.hote = hote;
        this.adresse = adresse;
        this.superficie = superficie;
    }

    public void afficher() {
        System.out.println("Le logement est situé " + adresse +
                ".\nSuperficie : " + superficie + "m²");
    }

    public int getTarifParNuit() {
        return tarifParNuit;
    }
}
