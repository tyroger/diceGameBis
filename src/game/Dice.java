package game;

public class Dice {

    private int diceValue;

    public Dice(){}

    public void setDiceValue(int diceValue) {
        this.diceValue = diceValue;
    }

    /**
     * renvoie la valeur du dé
     */
    public void getDiceValue(){
    this.setDiceValue(0);
    }

    /**
     * change la valeur du dé.
     * retourne une valeur aléatoire comprise entre 1 et 6
     */
    public int throwDice(){
        int randomValue;
        int minValue = 1;
        int maxValue = 6;
        randomValue = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
        return randomValue;
    }

}
