package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte b = 1;
        short s = 10;
        int i = 100;
        long ltotal = 50000l+10l*(b+s+i);
        System.out.println("result "+ltotal);
        short stotal = (short) (50000+10*(b+s+i));
        System.out.println("result " +stotal);
    }

}
