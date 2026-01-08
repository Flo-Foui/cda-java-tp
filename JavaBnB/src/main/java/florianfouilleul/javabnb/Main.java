package florianfouilleul.javabnb;

import florianfouilleul.javabnb.logements.Logement;
import florianfouilleul.javabnb.reservations.Sejour;
import florianfouilleul.javabnb.utilisateurs.Personne;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Personne personne1 = new Personne("Maxime", "Albert", 25);
        Personne personne2 = new Personne("Joris", "Maurice", 42);
        Logement logement1 = new Logement(personne1, 50, "81 Rue Colbert, 37000 Tours", 140, 6);
        Logement logement2 = new Logement(personne2, 84, "15 Rue de la poupée qui tousse, 42042 Tataouine-les-Bains", 69, 2);
        Sejour sejour1 = new Sejour(LocalDate.of(2026, 3, 17), 2, logement1, 5);
        Sejour sejour2 = new Sejour(LocalDate.of(2028, 6, 23), 3, logement2, 3);

        personne1.afficher();
        logement1.afficher();
        sejour1.afficher();

        personne2.afficher();
        logement2.afficher();
        sejour2.afficher();
    }
}