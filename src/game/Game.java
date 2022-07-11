package game;

import java.util.ArrayList;
import java.util.List;

/**
 * créer une partie, ajouter les joueurs et définir le vainqueurs, après un nombre n de parties.
 */
public class Game {

        private List<Player> players = new ArrayList<>();
        private int round;
        Shaker shaker;

    //_____constructeur _____ :
        public Game(int round, int dices){
            this.setRound(round);
        }

    //_____getters & setters _____ :

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }


    //_____méthodes _____ :

    /**
     * Ajouter un joueur à une partie
     */
    public void initialize(Player player){
            players.add(player);
    }

    /**
     * lancer une partie, et determiner le gagnant
     */
    public void launchGame(){
    Player winner = players.get(0);
        for (int i = 0; i <round; i++) {
            for (Player player: players
            ) {
                player.play(shaker);
                player.displayPlayerScore();

                if(player.getScore() > winner.getScore()){
                    winner = player;
                }
            }
            this.showWinner(winner);
        }
    }

    /**
     * afficher qui est le vainqueur de la partie
     */
    public void showWinner(Player player){
        System.out.println("le vainqueur de la partie est : " + player.getLastname());

    }
}
