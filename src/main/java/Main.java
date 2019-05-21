import datamodel.Tablica;

public class Main {

    public static void main(String[] args) {
        Tablica tab = new Tablica(new int[5]);
        tab.fillTab();
        System.out.println(tab);
        System.out.println(tab.sumOddElements());

    }

}
