package academy.learnprogramming;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        if (number<0) {
            return -1;
        } else {
            int result=0;
            while (number>0){
                if(number%2==0){
                    result+=number%10;
                }
                number/=10;
            }
            return result;
        }
    }

}
