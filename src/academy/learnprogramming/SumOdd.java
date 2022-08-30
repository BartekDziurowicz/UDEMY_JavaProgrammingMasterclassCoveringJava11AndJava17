package academy.learnprogramming;

public class SumOdd {

    public static boolean isOdd(int number){
        return number>0 && number%2!=0;
    }

    public static int sumOdd(int start, int end){
        int sumOdd=0;
        if(start>end || start<0 || end<0){
            sumOdd=-1;
        } else {
            for(int i=start;i<=end;i++){
                if(isOdd(i)){
                    sumOdd+=i;
                }
            }
        }
        return sumOdd;
    }

}
