package datamodel;

import java.util.Scanner;

public class TabLogic {
    static Scanner sc = new Scanner(System.in);

    public static int[] fillTab(int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            System.out.println("podaj liczbę całkowita numer: " + (i + 1));
            tab[i] = sc.nextInt();
        }
        return tab;
    }

    public static int sumOddElements(int[] tab) {
        int sum = 0, i = 0;
        for (int liczba : tab) {
            i++;
            if (i % 2 == 1) {
                sum += liczba;
            }
        }
        return sum;
    }
}
