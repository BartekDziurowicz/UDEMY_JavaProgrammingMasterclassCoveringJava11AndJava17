package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver==true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println(finalScore);

            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            finalScore = score + (levelCompleted * bonus);
            System.out.println(finalScore);
        }

        if (gameOver) {
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int finalScore = score + (levelCompleted * bonus);
            System.out.println(finalScore);
        }

    }

}
