package academy.learnprogramming;

import static academy.learnprogramming.PlayingCat.isCatPlaying;

public class Main {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

    }
}
