import game.Dice;
import game.Game;
import game.Player;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {

        Scanner getInfo = new Scanner(System.in);

        int dices;
        System.out.println("quel est le nombre de dés ? : ");
        dices = getInfo.nextInt();

        for (int i = 0; i < dices; i++) {
            Dice dice = new Dice();
        }

        int round;
        System.out.println("quel est le nombre de parties ? : ");
        round = getInfo.nextInt();


        String lastName;
        System.out.println("le nom du joeur : ");
        lastName = getInfo.next();
        Player playerOne = new Player(lastName);

        System.out.println("le nom du second joeur : ");
        lastName = getInfo.next();
        Player playerTwo = new Player(lastName);


        Game game = new Game(round, dices);

        // ajouter les joueurs à la partie :
        game.initialize(playerOne);
        game.initialize(playerTwo);

        // lancer la partie
        game.launchGame();

    }
}
