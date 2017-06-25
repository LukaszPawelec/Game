package pl.com.bottega.game.engine;

import java.util.Random;

public class ComputerPlayer implements Player{

    private String name;
    private Random random = new Random();

    public ComputerPlayer(String name){
        this.name = name;
    }

    public String giveHand(){
        int r = random.nextInt(3);
        String computerHand = null;
        switch (r) {
            case 0:
                computerHand = "kamien";
                break;
            case 1:
                computerHand = "nozyce";
                break;
            case 2:
                computerHand = "papier";
                break;
        }

        return computerHand;
    }

    public String getName(){
        return name;
    }
}
