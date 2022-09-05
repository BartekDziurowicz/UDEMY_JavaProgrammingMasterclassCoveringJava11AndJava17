package academy.learnprogramming;

public class LargestPrime {

    public static int getLargestPrime(int number){
        int largestPrime = -1;
        for(int i=0;i<number/2;i++){
            if(isPrime(i) && number%i==0){
                largestPrime=i;
            }
        }
        return largestPrime;
    }

    public static boolean isPrime(int number){
        if(number<2){
            return false;
        }
        else {
            for(int i=2;i<number/2;i++){
                if(number%i==0){
                    return false;
                }
            }
        }
        return true;
    }

}
