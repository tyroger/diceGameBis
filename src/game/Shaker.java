package game;

import java.util.ArrayList;
import java.util.List;

public class Shaker {

    private int shakerValue;
    public List<Dice> dicesTable;

    //_____constructeur _____ :
    public Shaker(List<Dice> dicesNumber) {
        this.setShakerValue(0);
        this.dicesTable = dicesNumber;
    }


    public void setShakerValue(int shakerValue) {
        this.shakerValue = shakerValue;
    }


    //_____Méthodes_____ :

    /**
     * renvoie la valeur (somme) des dés du gobelet
     */
    public int getShakervalue() {
        for (Dice dice : dicesTable
        ) {
            this.shakerValue += dice.getDiceValue();
        }
        return shakerValue;
    }


    /**
     * changer la valeur des dés dans le gobelet,met à jour sa valeur
     */
    public void throwDices() {
        for (Dice dice : dicesTable
        ) {
            dice.throwDice();
        }
    }


    public void showThrowDicesValue() {
        System.out.println("score dernier lancé : " + getShakervalue());
    }
}
