package academy.learnprogramming;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && (hourOfDay%23<8 || hourOfDay%23>22) && hourOfDay>=0) {
            return true;
        }
        return false;
    }

}
