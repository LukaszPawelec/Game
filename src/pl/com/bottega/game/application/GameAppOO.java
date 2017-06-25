package pl.com.bottega.game.application;


import pl.com.bottega.game.engine.*;

import java.util.Scanner;

public class GameAppOO {
    public static void main(String[] args){
        short gamesCount = readGamesCount();

        //HumanPlayer human = new HumanPlayer("Andrzej");
        Player computer = new ComputerPlayer("HAL");
        Player computer2 = new ComputerPlayer("Deep Blue");

        Arbiter arbiter = new Arbiter(gamesCount, computer2, computer);
        ScoreBoard primaryScoreBoard = new ScoreBoard(gamesCount, computer2.getName(), computer.getName());

        for (short counter = 0; counter<=gamesCount; counter++) {
            byte result = arbiter.playRound();
            primaryScoreBoard.refresh(result);
        }
    }

    private static short readGamesCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc gier: ");
        short count = scanner.nextShort();
        scanner.nextLine();
        return count;
    }
}
