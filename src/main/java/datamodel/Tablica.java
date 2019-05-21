package datamodel;

import java.util.Arrays;
import java.util.Scanner;

public class Tablica {

    private int[] tab;

    @Override
    public String toString() {
        return "Tablica{" +
                "tab=" + Arrays.toString(tab) +
                '}';
    }

    public int[] getTab() {
        return tab;
    }

    public void setTab(int[] tab) {
        this.tab = tab;
    }

    public Tablica() {
    }

    public Tablica(int[] tab) {
        this.tab = tab;
    }

    public void fillTab() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.tab.length; i++) {
            System.out.println("podaj liczbę całkowita numer: " + (i + 1));
            this.tab[i] = sc.nextInt();
        }
    }

    public int sumOddElements() {
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
