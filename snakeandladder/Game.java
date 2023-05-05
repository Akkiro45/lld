package snakeandladder;

import java.util.LinkedList;
import java.util.Queue;

import snakeandladder.dice.Dice;
import snakeandladder.specialentity.SpecialEntity;

public class Game {
    private Board board;
    private Dice dice;
    private Queue<Player> players;
    private GameStatus status;

    public Game(Board board, Dice dice) {
        this.board = board;
        this.dice = dice;
        this.players = new LinkedList<>();
        this.status = GameStatus.NOT_STARTED;
    }

    public GameStatus getGameStatus() {
        return this.status;
    }

    public void addPlayer(Player player) throws Exception {
        if(this.getGameStatus() != GameStatus.NOT_STARTED) {
            throw new Exception("Cannnot add playesr now!");
        }
        player.setPosition(0);
        players.offer(player);
    }

    public void restart() {
        for(Player player : players) {
            player.setPosition(0);
        }
        this.status = GameStatus.NOT_STARTED;
    }

    public void startGame() throws Exception {
        if(this.getGameStatus() != GameStatus.NOT_STARTED) {
            throw new Exception("Cannnot start game!");
        }
        this.status = GameStatus.STARTED;
        while(players.size() > 1) {
            Player player = players.poll();

            makeMove(player);

            if(player.getPosition() == this.board.getTotalCells()) {
                System.out.println("Player " + player.getName() + " has finished!");
            } else {
                players.offer(player);
            }
        }
        this.status = GameStatus.FINISHED;
        System.out.println("Game Over!");
    }

    private void makeMove(Player player) throws Exception {
        System.out.println("Player " + player.getName() + " turn:");
        
        int jump = this.dice.roll();
        System.out.println("Jump value : " + jump);
        
        int nextPos = player.getPosition() + jump;
        
        if(nextPos > board.getTotalCells()) {
            return;
        }

        if(board.hasSpecialEntity(nextPos)) {
            SpecialEntity specialEntity = board.getSpecialEntity(nextPos);
            System.out.println(specialEntity.getType() + " has encountered!");
            nextPos = specialEntity.getEndPosition();
        }
        player.setPosition(nextPos);
        System.out.println("Player " + player.getName() + " jumed to : " + nextPos);
    }
}
