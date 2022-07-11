import game.Game;
import game.Player;

public class Play {
    public static void main(String[] args) {

        int dices = 3;
        int round = 3;

        Player playerOne = new Player("toto");
        Player playerTwo = new Player("dédé");

        Game game = new Game(round, dices);

        game.initialize(playerOne);
        game.initialize(playerTwo);

        game.launchGame();




    }
}
