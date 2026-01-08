package florianfouilleul.javabnb.reservations;

import florianfouilleul.javabnb.logements.Logement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Sejour {

    private LocalDate dateArrivee;
    private int nbNuits;
    private Logement logement;
    private int nbVoyageurs;
    private int prix;

    public Sejour(LocalDate dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
        this.dateArrivee = dateArrivee;
        this.nbNuits = nbNuits;
        this.logement = logement;
        this.nbVoyageurs = nbVoyageurs;
        this.prix = logement.getTarifParNuit() * nbNuits;
    }

    public void afficher() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.FRANCE);
        String dateFr = dateArrivee.format(formatter);

        System.out.printf("""
                La date d'arrivée est le %s pour %d nuits.
                Le prix de ce séjour est de %d€
                """, dateFr, nbNuits, prix);
    }

}
