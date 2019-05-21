import datamodel.TabLogic;

public class Main {

    public static void main(String[] args) {
        int[] tab;
        tab = TabLogic.fillTab(new int[5]);
        System.out.println(TabLogic.sumOddElements(tab));
    }
}
