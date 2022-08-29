package academy.learnprogramming;

public class MinutesToYearAndDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if(minutes<0){
            System.out.println("Invalid value");
        } else {
            long years = minutes / 525600;
            long days = (minutes % 525600) / 1440 ;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

}
