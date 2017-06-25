package pl.com.bottega.game.engine;

import java.util.Scanner;

public class HumanPlayer implements Player{

    private String name;

    private Scanner scanner = new Scanner(System.in);

    public HumanPlayer(String name) {
        this.name = name;
    }

    public String giveHand(){
        System.out.println("Wpisz: kamien, nozyce, papier");

        String hand = scanner.nextLine();
        if (!(hand.equals("kamien") || hand.equals("nozyce") || hand.equals("papier"))) {
            System.out.println("input error");
            return null;
        }

        return hand;
    }

    public String getName(){
        return name;
    }
}
