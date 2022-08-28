package academy.learnprogramming;

public class Main {

    public static void displayHighScorePosition(String name, int score) {
        System.out.println(name + " managed to get into position " + calculateHighScorePosition(score) + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {

        displayHighScorePosition("Bartek", 1500);
        displayHighScorePosition("Bartek", 900);
        displayHighScorePosition("Bartek", 400);
        displayHighScorePosition("Bartek", 50);

    }

}
