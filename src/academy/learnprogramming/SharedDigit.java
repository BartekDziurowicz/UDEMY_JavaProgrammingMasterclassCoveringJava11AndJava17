package academy.learnprogramming;

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b){
        if(a<10 || a>99 || b<10 || b>99){
            return false;
        }
        int startNum2 = b;
        while (a>0 ){
            int digitNum1 = a%10;
            b = startNum2;
            while (b>0){
                int digitNum2 = b%10;
                if (digitNum1 == digitNum2){
                    return true;
                }
                b/=10;
            }
            a/=10;
        }
        return false;
    }

}
