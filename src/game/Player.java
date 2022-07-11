package game;

public class Player {

    private String lastname;
    private int score;

    //_____constructeur _____ :

    public Player(String lastname){
        this.setLastname(lastname);
        this.setScore(0);
    }

    //getters & setters _____ :

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    //_____Méthodes _____ :

    public void play(Shaker shaker){
        shaker.throwDices();
        this.score += shaker.getShakervalue();
    }

    public void displayPlayerScore(){
        System.out.println("score du joeur " + this.score);
    }
}
