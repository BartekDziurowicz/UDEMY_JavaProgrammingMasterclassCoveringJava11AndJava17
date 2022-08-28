package academy.learnprogramming;

import static academy.learnprogramming.EqualSumChecker.hasEqualSum;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));

    }
}
