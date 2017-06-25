package pl.com.bottega.game.engine;

public class ScoreBoard {
    private short points1;
    private short points2;

    private short maxRounds;
    private short currentRound;

    private String host;
    private String guest;

    public ScoreBoard(short maxRounds, String host, String guest) {
        this.maxRounds = maxRounds;
        this.host = host;
        this.guest = guest;
    }

    public void refresh(byte result){
        if (result == -1){
            displaySummary();
            return;
        }

        currentRound++;

        String message = null;
        switch (result){
            case 0:
                message = "remis";
                break;
            case 1:
                points1++;
                message = "wygrał " + host;
                break;
            case 2:
                message = "wygrał " + guest;
                points2++;
        }

        displayCurrentState(message);
    }

    private void displayCurrentState(String message) {
        System.out.println(currentRound + ". " + message + " - " + host + ": " + points1 + " | " + guest + ": " + points2);
    }

    private void displaySummary() {
        if (points1 == points2)
            System.out.println("remis");
        else {
            String nr = points1 > points2 ? host : guest;
            System.out.println("Wygrał gracz: " + nr + " punktami: " + Math.abs(points1 - points2));
        }
    }
}
