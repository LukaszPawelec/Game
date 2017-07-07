package pl.com.bottega.game.engine;

import java.util.Scanner;

public class HumanPlayer implements Player {

    private String name;
    private Scanner scanner = new Scanner(System.in);
    private int errorsCounter;

    public HumanPlayer(String name) {
        this.name = name;
    }

    public String giveHand() {
        System.out.println("Wpisz: kamien, nozyce, papier");
        int counter = 0;
        String hand = scanner.nextLine();
        while (!(hand.equals("kamien") || hand.equals("nozyce") || hand.equals("papier")) && counter < 3) {
            System.out.println("try again");
            hand = scanner.nextLine();
            counter++;
            counterAdder(counter);
        }
        if(hand.equals("kamien") || hand.equals("nozyce") || hand.equals("papier"))
            return hand;
        else
            return null;
    }

    public String getName() {
        return name;
    }

    private void counterAdder(int errors){
        errorsCounter = (errorsCounter + errors);
    }

}