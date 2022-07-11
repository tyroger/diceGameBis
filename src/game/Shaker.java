package game;

import java.util.ArrayList;
import java.util.List;

public class Shaker {

    private int shakerValue;
    public List<Dice> dicesTable = new ArrayList<>();

    // constructeur
    public Shaker(int dicesNumber) {
        this.setShakerValue(0);
    }

    public void setShakerValue(int shakerValue) {
        this.shakerValue = shakerValue;
    }

    // méthodes :

    /**
     * renvoie la valeur du gobelet
     */
    public void getShakervalue() {
        for (Dice dice : dicesTable
        ) {
            dice.
        }
    }

    /**
     * changer la valeur des dés dans le gobelet,met à jour sa valeur
     */
    public void throwDices() {
    }


    public void showThrowDicesValue() {
    }


}
