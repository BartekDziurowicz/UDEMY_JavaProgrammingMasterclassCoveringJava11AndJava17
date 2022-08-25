package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double first = 20.00;
        double second = 80.00;
        double total = (first + second) * 100;
        double remainder = total%40.00;
        boolean bool = (remainder==0) ? true : false;
        System.out.println(bool);
        if (!bool) {
            System.out.println("Got some remainder!");
        }
    }

}
