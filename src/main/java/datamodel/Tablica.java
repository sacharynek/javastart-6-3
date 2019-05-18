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

    public static int readElementFromCMD() {

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę całkowita");
        return sc.nextInt();

    }

    public void fillTab(){
        for(int i = 0; i<this.tab.length;i++){
            this.tab[i] = Tablica.readElementFromCMD();
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
