package florianfouilleul.javabnb.logements;

import florianfouilleul.javabnb.utilisateurs.Personne;

public class Logement {

    private Personne hote;
    private int tarifParNuit;
    private String adresse;
    private int superficie;
    private int nbVoyageursMax;

    public Logement(Personne hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax) {
        this.hote = hote;
        this.tarifParNuit = tarifParNuit;
        this.adresse = adresse;
        this.superficie = superficie;
        this.nbVoyageursMax = nbVoyageursMax;
    }

    public void afficher() {
        System.out.println("Le logement est situé " + adresse +
                ".\nSuperficie : " + superficie + "m²");
    }

    public int getTarifParNuit() {
        return tarifParNuit;
    }
}
