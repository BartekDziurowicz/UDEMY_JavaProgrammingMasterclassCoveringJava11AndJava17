package academy.learnprogramming;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int last = number%10;
        while(number%10>9){
            number/=10;
        }
        return number+last;
    }

}
