package pl.com.bottega.game.application;


import pl.com.bottega.game.engine.*;

import java.util.Scanner;

public class GameAppOO {
    public static void main(String[] args){
        short gamesCount = readGamesCount();

        //HumanPlayer human = new HumanPlayer("Andrzej");
        Player player1 = new ComputerPlayer("HAL");
        Player player2 = new ComputerPlayer("Deep Blue");

        Arbiter arbiter = new Arbiter(gamesCount, player1, player2);
        ScoreBoard primaryScoreBoard = new ScoreBoard(gamesCount, player1.getName(), player2.getName());

        byte result = 0;
        do{
            result = arbiter.playRound();
            primaryScoreBoard.refresh(result);
        }while(result != -1);
    }

    private static short readGamesCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc gier: ");
        short count = scanner.nextShort();
        scanner.nextLine();
        return count;
    }
}
