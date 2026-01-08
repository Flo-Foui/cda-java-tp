package org.example;

import java.util.Scanner;

public class TP1 {

    // Le scanner permet de saisir au clavier des données lors de l'exécution du programme.
    private static Scanner scanner;

    // Méthode principale
    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        // Appel de la méthode de l'exercice correspondant
        exercice4_1();

        scanner.close();
    }

    // Méthode de l'exercice n°1.1
    public static void exercice1_1() {

        // 1° - Déclaration
        String prenom;
        String nom;
        int age;

        // 2° - Initialisation
        System.out.print("Prénom : ");
        prenom = scanner.next();
        System.out.print("Nom : ");
        nom = scanner.next();
        System.out.print("Age : ");
        age = scanner.nextInt();

        // 3° - Utilisation
        System.out.println("Bonjour " + prenom + " " + nom + " (" + age + "ans)");
    }

    // Méthode de l'exercice n°1.2
    public static void exercice1_2() {

        System.out.print("Valeur de x : ");
        int x = scanner.nextInt();
        System.out.print("Valeur de y : ");
        int y = scanner.nextInt();

        int z = x;
        x = y;
        y = z;

        System.out.println("Les valeurs sont permutées, x vaut " + x + " et y vaut " + y);
    }

    public static void exercice2_1() {

        System.out.println("Saisir un premier mot");
        String firstWord = scanner.next();
        System.out.println("Saisir un second mot");
        String secondWord = scanner.next();

        if (firstWord.length() == secondWord.length()) {
            System.out.println("Les deux mots ont le même nombre de caractères");
        } else if (firstWord.length() > secondWord.length()) {
            System.out.println(firstWord + " est le mot le plus long");
        } else
            System.out.println(secondWord + " est le mot le plus long");
    }

    private static void exercice2_2() {

        System.out.print("Entrez une année : ");
        int year = scanner.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("L'année " + year + " est bissextile");
        } else
            System.out.println("L'année " + year + " n'est pas bissextile");
    }

    private static void exercice3_1() {

        int maxNumber = 0;
        int maxIndex =0;
        int minNumber = 101;
        int minIndex = 0;
        for (int i = 1; i <= 10; i++) {
            int random = (int) (Math.random() * 101);
            System.out.println("Le nombre " + i + " vaut " + random);
            if (random > maxNumber) {
                maxNumber = random;
                maxIndex = i;
            }
            if (random < minNumber) {
                minNumber = random;
                minIndex = i;
            }
        }
            System.out.println("Le maximum vaut " + maxNumber + " (numéro " + maxIndex +
                                ") et le minimum vaut " + minNumber + " (numéro " + minIndex +")");
    }

    private static void exercice4_1() {

        int random = (int) (Math.random() * 501);
        int guess = -1;
        int i = 0;

        while (guess != random) {
            System.out.print("Entrez un nombre : ");
            guess = scanner.nextInt();
            i++;

            int diff = Math.abs(guess - random);

            if (diff == 0) {
            } else if (diff > 100){
                System.out.println("très froid");
            } else if (diff > 50) {
                System.out.println("froid");
            } else if (diff > 15) {
                System.out.println("tiède");
            } else if (diff > 5) {
                System.out.println("chaud");
            } else {
                System.out.println("très chaud");
            }
        }

        System.out.printf("Bravo ! Tu as gagné en %d tentatives !", i);
    }

    private static void exercice4_2() {

        int random = (int)(Math.random() * 101);
        int guess;
        int i = 0;

        do {
            System.out.print("Entrez un nombre : ");
            guess = scanner.nextInt();
            i++;

            int diff = Math.abs(guess - random);

            if (diff == 0) {
            } else if (diff > 20) {
                System.out.println("froid");
            } else if (diff > 5) {
                System.out.println("tiède");
            } else {
                System.out.println("chaud");
            }

        } while (guess != random);

        System.out.printf("Bravo ! Tu as gagné en %d tentatives !", i);
    }

    private static void justePrix() {

        int random = (int)(Math.random() * 10001);
        int guess;
        int i = 0;

        do {
            System.out.print("Entrez un nombre : ");
            guess = scanner.nextInt();
            i++;

            if (random == guess) {
            } else if (random > guess) {
                System.out.println("C'est plus !");
            } else {
                System.out.println("C'est moins");
            }

        } while (guess != random);

        System.out.printf("Bravo ! Tu as gagné en %d tentatives !", i);
    }
}
