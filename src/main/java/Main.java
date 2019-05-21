import datamodel.Tablica;

public class Main {

    public static void main(String[] args) {
        int[] tab;
        tab = Tablica.fillTab(new int[5]);
        System.out.println(Tablica.sumOddElements(tab));
    }
}
