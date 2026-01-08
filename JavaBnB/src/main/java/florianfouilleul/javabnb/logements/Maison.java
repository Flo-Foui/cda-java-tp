package florianfouilleul.javabnb.logements;

import florianfouilleul.javabnb.utilisateurs.Hote;

public class Maison extends Logement {

    private boolean jardin;
    private int surfaceJardin;
    private boolean piscine;

    public Maison(Hote hote, String adresse, int superficie,
                  boolean jardin, int surfaceJardin, boolean piscine) {
        super(hote, adresse, superficie);
        this.jardin = jardin;
        this.surfaceJardin = surfaceJardin;
        this.piscine = piscine;
    }

    @Override
    public void afficher() {
        hote.afficher();
        System.out.println("Le logement est une maison située " + adresse + ".");
        System.out.println("Superficie : " + superficie + "m2");

        if (jardin) {
            System.out.println("Jardin : Oui (" + surfaceJardin + "m2)");
        } else {
            System.out.println("Jardin : Non");
        }

        System.out.println("Piscine : " + (piscine ? "Oui" : "Non"));
    }
}
