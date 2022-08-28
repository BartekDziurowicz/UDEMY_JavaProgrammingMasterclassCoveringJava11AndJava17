package academy.learnprogramming;


import static academy.learnprogramming.BarkingDog.shouldWakeUp;

public class Main {

    public static void main(String[] args) {

        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));

    }
}
