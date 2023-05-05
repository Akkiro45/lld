package snakeandladder;

import snakeandladder.dice.Dice;
import snakeandladder.dice.OneDice;
import snakeandladder.specialentity.Snake;
import snakeandladder.specialentity.SpecialEntities;
import snakeandladder.specialentity.SpecialEntity;

public class Main {
    public static void main(String[] args) throws Exception {
        Board board = new Board(20);
        Dice dice = new OneDice();
        Game game = new Game(board, dice);
        
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        game.addPlayer(player1);
        game.addPlayer(player2);

        SpecialEntity snake1 = new Snake(10, 3, SpecialEntities.SNAKE);
        SpecialEntity snake2 = new Snake(18, 9, SpecialEntities.SNAKE);
        board.addSepcialEntity(snake1);
        board.addSepcialEntity(snake2);
        
        SpecialEntity ladder1 = new Snake(2, 11, SpecialEntities.LADDER);
        SpecialEntity ladder2 = new Snake(8, 16, SpecialEntities.LADDER);
        board.addSepcialEntity(ladder1);
        board.addSepcialEntity(ladder2);

        game.startGame();
    }
}
