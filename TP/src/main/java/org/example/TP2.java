package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TP2 {

    private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        exerciceQuickSort();

        scanner.close();
    }

    private static void ex1NoRecuNoTab() {

        System.out.print("Entrez un nombre : ");
        int n = scanner.nextInt();

        int f0 = 0;
        int f1 = 1;
        System.out.print(f0 + " ");

        if (n >= 1) {
            System.out.print(f1 + " ");
        }

        for (int i = 2; i <= n; i++) {
            int fn = f0 + f1;
            System.out.print(fn + " ");
            f0 = f1;
            f1 = fn;
        }

        System.out.println();
        System.out.print("Fibo à F" + n + " = " + (n == 0 ? f0 : f1));
    }

    private static void ex1NoRecuWithTab() {

        System.out.print("Entrez un nombre : ");
        int n = scanner.nextInt();

        int[] fibo = new int[n + 1];

        fibo[0] = 0;
        if (n >= 1) {
            fibo[1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        for (int i = 0; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }

        System.out.println();
        System.out.println("Fibo à F" + n + " = " + fibo[n]);
    }

    private static class Ex1WithRecuWithTab {

        private static int[] memo;

        public static int fibonacci(int n) {

            if (memo[n] != -1) {
                return memo[n];
            }
            memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
            return memo[n];
        }

        public static void run() {

            System.out.print("Saisir un nombre : ");
            int n = scanner.nextInt();

            memo = new int[n + 1];
            Arrays.fill(memo, -1);
            memo[0] = 0;
            if (n >= 1) memo[1] = 1;

            for (int i = 0; i <= n; i++) {
                System.out.print(fibonacci(i) + " ");
            }

            System.out.println();
            System.out.println("Fibo à F" + n + " = " + fibonacci(n));
        }
    }

    private static void exercice2() {

        System.out.print("Entrez la longueur du tableau : ");
        int n = scanner.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("tab[" + i + "] = ");
            tab[i] = scanner.nextInt();
        }

        System.out.println("Tableau initial : " + Arrays.toString(tab));

        int max = tab[0];
        for (int i = 1; i < n; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }

        int[] tabComptage = new int[max + 1];

        for (int value : tab) {
            tabComptage[value]++;
        }

        System.out.println("Tableau de comptage : " + Arrays.toString(tabComptage));

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (tabComptage[i] > 0) {
                tab[index] = i;
                index++;
                tabComptage[i]--;
            }
        }

        System.out.println("Tableau trié : " + Arrays.toString(tab));
    }

    private static void exercice3() {

        System.out.print("Entrez la longueur du tableau : ");
        int n = scanner.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("tab[" + i + "] = ");
            tab[i] = scanner.nextInt();
        }

        System.out.println("Tableau initial : " + Arrays.toString(tab));

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }

        System.out.println("Tableau trié : " + Arrays.toString(tab));
    }

    private static void exerciceQuickSort() {

        System.out.print("Entrez la longueur du tableau : ");
        int n = scanner.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("tab[" + i + "] = ");
            tab[i] = scanner.nextInt();
        }

        System.out.println("Tableau initial : " + Arrays.toString(tab));

        quickSort(tab, 0, tab.length - 1);

        System.out.println("Tableau trié (QuickSort) : " + Arrays.toString(tab));
    }

       private static void quickSort(int[] tab, int debut, int fin) {
        if (debut < fin) {
            int posPivot = partition(tab, debut, fin);
            quickSort(tab, debut, posPivot - 1);
            quickSort(tab, posPivot + 1, fin);
        }
    }

    private static int partition(int[] tab, int debut, int fin) {
        int pivot = tab[fin];
        int i = debut;
        int positionPivot = fin;

        while (i < positionPivot) {
            if (tab[i] > pivot) {
                int temp = tab[i];

                for (int j = i; j < positionPivot; j++) {
                    tab[j] = tab[j + 1];
                }

                tab[positionPivot] = temp;

                positionPivot--;
            } else {
                i++;
            }
        }

        return positionPivot;
    }
}
