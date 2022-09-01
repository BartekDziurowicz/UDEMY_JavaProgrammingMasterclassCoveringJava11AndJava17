package academy.learnprogramming;

public class AllFactors {

    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
        } else {
            int i = 1;
            while(i<=number/2){
                if(number%i==0){
                    System.out.print(i+" ");
                }
                i++;
            }
            System.out.println(number);
        }
    }

}
