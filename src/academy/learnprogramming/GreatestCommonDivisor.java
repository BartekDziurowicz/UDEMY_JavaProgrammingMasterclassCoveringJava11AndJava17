package academy.learnprogramming;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int a, int b){
        if(a<10 || b<10){
            return -1;
        }
        if (a%b==0){
            return b;
        }
        if (b%a==0){
            return a;
        }
        for(int i=a/2;i>0;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return -1;
    }

}
