package florianfouilleul.javabnb;

import florianfouilleul.javabnb.logements.Maison;
import florianfouilleul.javabnb.reservations.Sejour;
import florianfouilleul.javabnb.utilisateurs.Hote;
import florianfouilleul.javabnb.utilisateurs.Personne;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Personne personne1 = new Personne("Maxime", "Albert", 25);
        Personne personne2 = new Personne("Joris", "Maurice", 42);
        Hote hote1 = new Hote("Paul", "Durant", 31, 4);
        Maison maison1 = new Maison(hote1,"15 rue de la pouppée qui tousse, 42042 Tataouine-les-Bains", 200, true, 300, false);

        maison1.afficher();
    }
}