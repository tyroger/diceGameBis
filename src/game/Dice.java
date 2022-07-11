package game;

public class Dice {

    private int diceValue;

    //_____constructeur _____ :
    public Dice(){
        this.setDiceValue(0);
    }


    //_____getters & setters_____ :

    public void setDiceValue(int diceValue) {
        this.diceValue = diceValue;
    }



    //_____Méthodes_____ :

    /**
     * renvoie la valeur du dé
     */
    public int getDiceValue(){
        return this.diceValue;
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
